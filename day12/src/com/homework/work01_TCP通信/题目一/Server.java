package com.homework.work01_TCP通信.题目一;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws Exception {
        //创建ServerSocket，监听8888端口
        ServerSocket serverSocket = new ServerSocket(8888);

        System.out.println("服务端启动成功，正在等待客户端连接...");
        while (true) { //这个循环可加可不加，只要能收到客户端的消息即可。
            //等待连接
            Socket socket = serverSocket.accept();

            //获得输入流
            InputStream is = socket.getInputStream();

            //将字节输入流转换成字符输入流，这里只是为了方便读取一行数据，不转换也是可以的
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            //读取一行数据
            String message = br.readLine();

            //打印消息
            System.out.println("接收到来自客户端的消息：" + message);

            //释放资源
            is.close();
            socket.close();
        }
    }
}
