package com.homework.work01_TCP通信.题目二;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws Exception {
        //创建ServerSocket，监听8888端口
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务端启动成功，正在等待客户端连接...");
        while (true) {
            //等待连接
            Socket socket = serverSocket.accept();

            //获得输入流
            InputStream is = socket.getInputStream();

            //创建输出流（作用是保存文件）
            OutputStream outputStream = new FileOutputStream("day18/files/" + System.currentTimeMillis() + ".jpg");
            byte[] buf = new byte[1024];
            int len;
            //循环读写文件
            while ((len = is.read(buf)) != -1) {
                outputStream.write(buf, 0, len);
            }

            //通知客户端文件上传完毕
            OutputStream os = socket.getOutputStream();
            os.write("上传成功".getBytes());

            //释放资源
            os.close();
            outputStream.close();
            is.close();
            socket.close();

            System.out.println("接收到一个文件");
        }
    }
}
