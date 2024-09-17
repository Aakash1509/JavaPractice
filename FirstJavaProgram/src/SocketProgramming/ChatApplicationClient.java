package SocketProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatApplicationClient {
    Socket socket;
    //To read data
    BufferedReader br;

    //TO write data
    PrintWriter out;

    public ChatApplicationClient(){
        try{
            System.out.println("Sending request to server");
            socket = new Socket("localhost",9999);
            System.out.println("Connection done");

            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream());

            startReading();
            startWriting();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    //Both tasks need to be done simultaneously , so we will use multithreading
    public void startReading(){
        //this thread will keep reading data for us
        Runnable r1 = () -> {
            System.out.println("reader started..");
            try {
            while(true){
                    String msg = br.readLine();
                    if(msg.equals("exit")){
                        System.out.println("Server terminated the chat");
                        break;
                    }
                    System.out.println("Server : "+msg);
                }
            }
            catch (IOException e) {
//                throw new RuntimeException(e);
                System.out.println("Connection terminated");
            }
        };
        new Thread(r1).start();

    }

    public void startWriting(){
        //this thread will take data from server admin and will send to client
        Runnable r2 = () -> {
            System.out.println("Write started");
            try{
            while(!socket.isClosed()){

                    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
                    String content = br1.readLine();
                    out.println(content);
                    out.flush();

                    if(content.equals("exit")){
                        socket.close();
                        break;
                    }
                }

            }
            catch (Exception e){
//                e.printStackTrace();
                System.out.println("Connection terminated");
            }
        };
        new Thread(r2).start();
    }
    public static void main(String[] args) {
        System.out.println("Client started...");
        new ChatApplicationClient();
    }
}
