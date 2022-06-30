package com.itheima.demo4_数据上传案例;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {
    public static void main(String[] args) throws IOException {
        //创建服务端监听对象
        ServerSocket serverSocket = new ServerSocket(8888);

        //等待客户端连接
        Socket server = serverSocket.accept();
        //通过线程的方式启动，提高服务端响应速度
        //读取管道中的数据，并写道本地
        InputStream in = server.getInputStream();
        int len = -1;
        byte[] bys = new byte[1024];
        //创建本地输出流对象
        FileOutputStream fos = new FileOutputStream("day12\\resouce\\demo4\\imageCopy.jpg");
        while ((len = in.read(bys)) != -1) {
            //将读取到的数据写道本地
            fos.write(bys, 0, len);
        }
        System.out.println("服务器端接受数据完成");

        //给客户端发出反馈，告知数据上传成功
        OutputStream out = server.getOutputStream();

        out.write("数据上传成功".getBytes());
        //关流
        server.close();
        fos.close();
    }
}
