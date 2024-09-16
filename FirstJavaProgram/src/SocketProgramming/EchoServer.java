package SocketProgramming;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) throws IOException {
//        try {
//            System.out.println("Waiting for clients...");
//            ServerSocket ss = new ServerSocket(2222);
//            Socket soc = ss.accept();
//            System.out.println("Connection Established");
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println("S : Server is started");
        ServerSocket ss = new ServerSocket(9999); //if busy can throw exception
        System.out.println("S : Server is waiting for client request");
        Socket s = ss.accept(); //As soon as server receives request it will create a socket
        System.out.println("S : Client connected");

        //For buffer reader you need object of InputStreamReader

        //For fetching data these 2 lines are required
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str = br.readLine();

        System.out.println("S : Client data : "+str);

        String nickName = str.substring(0,3);

        //For sending data these 4 lines are required
        OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
        PrintWriter out = new PrintWriter(os);
        out.println(nickName);
        os.flush();
        System.out.println("S : Data sent from Server to Client");


    }
}
