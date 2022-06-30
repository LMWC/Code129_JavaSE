package com.itheima.demo6_BS结构程序;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //浏览器访问地址:http://192.168.18.120:8888/

        //创建服务器监听对象
        ServerSocket serverSocket = new ServerSocket(8888);
        while (true) {
            //监听连接，获取服务器对象
            Socket server = serverSocket.accept();
            System.out.println("服务器被访问了...");

            new ServerThread(server).start();
        }
    }
}
