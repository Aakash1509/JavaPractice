package SocketProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatApplicationServer {
    ServerSocket server; //for server
    Socket socket;//for client

    //To read data
    BufferedReader br;

    //TO write data
    PrintWriter out;

    public ChatApplicationServer() throws IOException {
        server = new ServerSocket(9999);
        System.out.println("Server is ready to accept connection");
        System.out.println("Waiting...");
        socket = server.accept();

        //Streams in java are unidirectional
        br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream());

        startReading();
        startWriting();
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
                        System.out.println("Client terminated the chat");
                        socket.close(); //But this will terminate only reading thread , writer thread will continue
                        break;
                    }
                    System.out.println("Client : "+msg);
                }
            }catch (Exception e) {
                System.out.println("Connection terminated");
                }
        };
        new Thread(r1).start();

    }

    public void startWriting(){
        //this thread will take data from server admin and will send to client
        Runnable r2 = () -> {
            System.out.println("Write started");
            try {
                while (!socket.isClosed()) {

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

    public static void main(String[] args) throws IOException {
        System.out.println("This is server...going to start server");
        new ChatApplicationServer();
    }

}
