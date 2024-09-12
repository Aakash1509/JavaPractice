package SocketProgramming;

import java.io.IOException;
import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) {
        try {
            System.out.println("Client started");
            Socket soc = new Socket("localhost",2222); //Localhost bcoz client and server are on same machines
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
