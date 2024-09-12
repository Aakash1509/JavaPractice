package SocketProgramming;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {
        try {
            System.out.println("Waiting for clients...");
            ServerSocket ss = new ServerSocket(2222);
            Socket soc = ss.accept();
            System.out.println("Connection Established");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
