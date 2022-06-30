package com.itheima.demo2_udp;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Receive {
    public static void main(String[] args) throws IOException {
        //接收端
        //数据包对象：DatagramPacket(byte[] buf, int length)：创建接收端数据包对象
        //数据包方法:     int 	getLength() 获得实际接收到的字节个数
        //              java.net.InetAddress getAddress() 获取ip地址对象


        //套接字对象： DatagramSocket(int port) 创建接收端的Socket对象并指定端口号
        //套接字方法 ： void receive(DatagramPacket p) 接收数据包


        //创建接收端对象
        DatagramSocket receive = new DatagramSocket(8888);

        //创建数据包对象
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);

        //接受数据
        receive.receive(packet);

        //处理数据
        System.out.println(new String(buf, 0, packet.getLength()));
        InetAddress ip = packet.getAddress();
        System.out.println(ip.getHostName());
        System.out.println(ip.getHostAddress());

        //receive.close();
    }
}
