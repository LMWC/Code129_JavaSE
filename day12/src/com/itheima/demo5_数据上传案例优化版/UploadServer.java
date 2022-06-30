package com.itheima.demo5_数据上传案例优化版;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {
    public static void main(String[] args) throws IOException {
        //创建服务端监听对象
        ServerSocket serverSocket = new ServerSocket(8888);

        //加循环，让服务器可以接受多个客户端的处理
        while (true) {
            //等待客户端连接
            Socket server = serverSocket.accept();
            //通过线程的方式启动，提高服务端响应速度
            new UploadServerThread(server).start();
        }
    }
}
