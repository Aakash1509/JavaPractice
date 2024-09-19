package SocketProgramming;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.ClientInfoStatus;

public class MultipleClientServer {
    private ServerSocket serverSocket;

    public MultipleClientServer(ServerSocket serverSocket){
        this.serverSocket = serverSocket;
    }

    public void startServer(){

        try
        {
            while(!serverSocket.isClosed()){
                Socket socket = serverSocket.accept();
                System.out.println("A new client has connected!");
                ClientHandler clientHandler = new ClientHandler(socket);

                //Instead of this I can use Thread Pool in my project
                Thread thread = new Thread(clientHandler);
                thread.start();
            }
        }
        catch (IOException e){

        }
    }

    public void closeServerSocket(){
        try{
            if(serverSocket != null){
                serverSocket.close();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException
    {
        ServerSocket serverSocket = new ServerSocket(9999);
        MultipleClientServer server = new MultipleClientServer(serverSocket);
        server.startServer();
    }
}
