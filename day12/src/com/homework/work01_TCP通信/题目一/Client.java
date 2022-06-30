package com.homework.work01_TCP通信.题目一;

import java.io.OutputStream;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws Exception {

        //创建Socket，连接本机的8888端口（也就是服务端）
        Socket socket = new Socket("127.0.0.1", 8888);

        //获取输出流
        OutputStream os = socket.getOutputStream();

        //发送消息
        os.write("你好，我是客户端小白。".getBytes());

        //释放资源
        os.close();
        socket.close();

        System.out.println("客户端消息发送成功");
    }
}
