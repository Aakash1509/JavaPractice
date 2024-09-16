package SocketProgramming;

import java.io.*;
import java.net.Socket;


public class EchoClient {
    public static void main(String[] args) throws IOException {
//        try {
//            System.out.println("Client started");
//
//            //Port : 0-1023 Reserved can go up to 65535 in case of int
//            Socket soc = new Socket("localhost",2222); //Localhost bcoz client and server are on same machines
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        String ip = "localhost";
        int port = 9999;
        Socket s = new Socket(ip,port);
        String str = "Aakash Saraiya";

        //In order to send data to server first need to convert data into stream
        OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream()); //Will convert data into stream
        //Need to mention from where to send the data,socket or monitor
        //s.getOutputStream() indicates output port of socket
        //Socket has 2 things : I/P and O/P port

        //To actually send data we need to create object of PrintWriter which is responsible to send data
        PrintWriter out = new PrintWriter(os);
//        os.write(str);
        //OR
        out.println(str);
        os.flush();//By default buffer size is 512B , to forcefully transfer data we use os.flush()


        //Receiving data

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String nickName = br.readLine();

        System.out.println("C : Data from Server " + nickName);

    }
}
