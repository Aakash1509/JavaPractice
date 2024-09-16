package SocketProgramming;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) throws Exception {
        //To work with UDP , you need special type of socket called Datagram socket
        DatagramSocket ds = new DatagramSocket();

        int i=8;
        //To transfer data you need to convert data into bytes
        //The byte array b holds the bytes of the string representation of the integer i.
        byte[] b = (i+"").getBytes();
        /*
        for(int j=0;j<b.length;j++){
            System.out.println(b[j]);
        }
        Will print ASCII value of 8 i.e. 56
         */
        InetAddress ia = InetAddress.getLocalHost();
        //to send data to server
        DatagramPacket dp = new DatagramPacket(b,b.length,ia,9999);
        ds.send(dp);


        //To accept the data

        //While receiving you need not to mention port number

        byte[] b1 = new byte[1024];
        DatagramPacket dp1 = new DatagramPacket(b1,b1.length);
        ds.receive(dp1);

        String str = new String(dp1.getData());
        System.out.println("Result is : "+str.trim());
    }
}
