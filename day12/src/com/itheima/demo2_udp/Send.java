package com.itheima.demo2_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Send {
    public static void main(String[] args) throws Exception {
        //发送端
        //数据包对象：DatagramPacket(byte[] buf, int length, InetAddress address, int port):创建发送端数据包对象

        //套接字对象：DatagramSocket() 创建发送端的Socket对象，系统会随机分配一个端口号。
        //套接字方法： void send(DatagramPacket dp) 发送数据包

        //创建发送端对象
        DatagramSocket send = new DatagramSocket();

        //创建数据包
        byte[] bys = "接收端，你好啊，小喇叭广播开始啦".getBytes();
        InetAddress ip = InetAddress.getByName("192.168.18.120");
        //广播地址
        //InetAddress ip = InetAddress.getByName("192.168.18.255");
        DatagramPacket packet = new DatagramPacket(bys, bys.length, ip, 8888);

        //发送数据
        send.send(packet);

        //send.close();
    }
}
