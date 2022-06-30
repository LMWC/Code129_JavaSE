package com.itheima.demo5_数据上传案例优化版;

import java.io.*;
import java.net.Socket;

public class UploadClient {
    public static void main(String[] args) throws IOException {
        //创建客户端对象
        Socket client = new Socket("192.168.18.120", 8888);

        //读本地数据，并写道管道中
        //FileInputStream fis = new FileInputStream("day12\\resouce\\demo4\\image.jpg");
        //提高读写速度
        BufferedInputStream fis = new BufferedInputStream(new FileInputStream("day12\\resouce\\demo4\\image.jpg"));
        int len = -1;
        byte[] bys = new byte[1024];
        //创建管道输出流对象
        //OutputStream out = client.getOutputStream();
        //提高读写速度
        BufferedOutputStream out = new BufferedOutputStream(client.getOutputStream());
        while ((len = fis.read(bys)) != -1) {
            //把数据写道管道中
            out.write(bys, 0, len);
        }
        System.out.println("数据发送完成");
        //告诉服务器数据写完了
        //注意:如果服务器端在重复读取数据，要告诉服务器数据写完了，让服务器不要再读数据了。
        client.shutdownOutput();

        //等待反馈
        InputStream in = client.getInputStream();
        len = in.read(bys);
        System.out.println(new String(bys, 0, len));

        //关流
        client.close();
        fis.close();
    }
}
