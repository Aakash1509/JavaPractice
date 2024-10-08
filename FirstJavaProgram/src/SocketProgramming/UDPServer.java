package SocketProgramming;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
    public static void main(String[] args) throws Exception{
        //Need to mention port number in server socket
        DatagramSocket ds = new DatagramSocket(9999);

        byte[] b1 = new byte[1024];

        DatagramPacket dp = new DatagramPacket(b1,b1.length);
        ds.receive(dp);
        String str = new String(dp.getData());
        int num = Integer.parseInt(str.trim());
        int result = num*num;
        byte[] b2 = (result+"").getBytes();
        //To send data to client
        InetAddress ia = InetAddress.getLocalHost();
        DatagramPacket dp1 = new DatagramPacket(b2,b2.length,ia,dp.getPort());
        ds.send(dp1);
    }
}
