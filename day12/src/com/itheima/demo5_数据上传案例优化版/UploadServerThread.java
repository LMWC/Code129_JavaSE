package com.itheima.demo5_数据上传案例优化版;

import java.io.*;
import java.net.Socket;

public class UploadServerThread extends Thread {
    private Socket server;


    public UploadServerThread(Socket server) {
        this.server = server;
    }

    @Override
    public void run() {
        //FileOutputStream fos = null;
        BufferedOutputStream fos = null;
        try {
            //读取管道中的数据，并写道本地
            //InputStream in = server.getInputStream();
            //提高读写速度
            BufferedInputStream in = new BufferedInputStream(server.getInputStream());
            int len = -1;
            byte[] bys = new byte[1024];
            //创建本地输出流对象
            //fos = new FileOutputStream("day12\\resouce\\demo4\\imageCopy" + System.currentTimeMillis() + ".jpg");
            //提高读写速度
            fos = new BufferedOutputStream(new FileOutputStream("day12\\resouce\\demo4\\imageCopy" + System.currentTimeMillis() + ".jpg"));
            while ((len = in.read(bys)) != -1) {
                //将读取到的数据写道本地
                fos.write(bys, 0, len);
            }
            System.out.println("服务器端接受数据完成");

            //给客户端发出反馈，告知数据上传成功
            OutputStream out = server.getOutputStream();
            out.write("数据上传成功".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关流
            try {
                if (server != null) {
                    server.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
