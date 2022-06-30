package com.itheima.demo3_tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

//客户端
public class Client {
    //Socket 一个该类的对象就代表一个客户端程序。
    //构造方法
    //public  Socket(String host, int port)根据ip地址字符串和端口号创建客户端Socket对象
    //调用该构造方法创建对象，会连接指定的服务器程序，如果不成功，抛出异常。如果成功，则表示三次握手通过。
    //常用方法
    //OutputStream getOutputStream(); 获得字节输出流对象
    //InputStream getInputStream();获得字节输入流对象


    public static void main(String[] args) throws IOException {
        //创建客户端对象
        //在创建这个对象的时候，就会立刻去找服务端，进行链接。
        Socket client = new Socket("192.168.18.120", 8888);

        //发送数据
        OutputStream out = client.getOutputStream();
        out.write("服务器，你好，我是客户端，我要买东西".getBytes());

        //接受反馈
        InputStream in = client.getInputStream();
        int len = -1;
        byte[] bys = new byte[1024];
        //read阻塞式
        len = in.read(bys);

        //处理数据
        System.out.println(new String(bys, 0, len));

        //关闭客户端对象
        client.close();

    }

}
