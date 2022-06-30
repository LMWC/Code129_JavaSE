package com.homework.work01_TCP通信.题目二;

import java.io.*;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws Exception {
        //创建Socket，连接本机的8888端口（也就是服务端）
        Socket socket = new Socket("127.0.0.1", 8888);

        //获取输出流
        OutputStream os = socket.getOutputStream();

        //创建输入流，读取文件
        InputStream is = new FileInputStream("day18/files/1.jpg");

        //发送图片文件
        byte[] buf = new byte[1024 * 8];
        int len;
        while ((len = is.read(buf)) != -1) {
            os.write(buf, 0, len);
        }

        //文件发送完毕后要关闭输出流，通知服务端
        socket.shutdownOutput();

        //接收服务端的回写数据
        InputStream inputStream = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String message = br.readLine();
        System.out.println(message);

        //释放资源 & 断开连接
        os.close();
        socket.close();
    }
}
