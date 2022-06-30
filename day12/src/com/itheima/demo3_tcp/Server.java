package com.itheima.demo3_tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//服务器端
public class Server {
    //ServerSocket  一个该类的对象就代表一个服务器端程序。
    //构造方法
    //public  ServerSocket(int port)：根据端口创建服务端ServerSocket对象。
    //常用方法
    //Socket accept():获得服务端Socket对象


    public static void main(String[] args) throws IOException {
        //创建服务端监听对象
        ServerSocket serverSocket = new ServerSocket(8888);

        //获取服务端对象
        //accept是一个阻塞式方法(如果没有人访问，等在这里)
        Socket server = serverSocket.accept();

        //读取客户端发送的数据
        InputStream in = server.getInputStream();
        int len = -1;
        byte[] bys = new byte[1024];
        //read阻塞式
        len = in.read(bys);

        //处理数据
        System.out.println(new String(bys, 0, len));

        //给客户端发出反馈
        byte[] bys2 = "你好客户端，我收到了".getBytes();
        OutputStream out = server.getOutputStream();
        out.write(bys2);

        //关闭服务对象
        server.close();

        //关闭监听对象(一般不关，等待下一位)
        //serverSocket.close();


    }
}
