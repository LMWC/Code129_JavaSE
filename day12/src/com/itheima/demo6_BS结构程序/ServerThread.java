package com.itheima.demo6_BS结构程序;

import java.io.*;
import java.net.Socket;

public class ServerThread extends Thread {
    private Socket server;

    public ServerThread(Socket server) {
        this.server = server;
    }

    @Override
    public void run() {
        FileInputStream fis = null;
        try {
            //读取请求头内容
            InputStream in = server.getInputStream();
            InputStreamReader isr = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(isr);
            //String line = null;
            //while ((line = br.readLine()) != null) {
            //    System.out.println(line);
            //}

            //获取浏览器需要的文件的请求路径
            String line = br.readLine();//GET /web/index.html HTTP/1.1
            System.out.println(line);
            //需要写会的文件路径:E:\forteach\javase2_129\javase2_code_129\day12\resouce\demo6\web\index.html
            String[] contents = line.split(" ");//contents[1]=/web/index.html
            System.out.println(contents[1]);

            String path = "day12\\resouce\\demo6\\" + contents[1];


            //将路径对应的数据，写给浏览器。
            OutputStream out = server.getOutputStream();
            fis = new FileInputStream(path);
            //写出响应头
            out.write("HTTP/1.1 200 OK \r\n".getBytes());
            out.write("Content-Type:text/html \r\n".getBytes());
            out.write("\r\n".getBytes());

            int len = -1;
            byte[] bys = new byte[1024];
            while ((len = fis.read(bys)) != -1) {
                out.write(bys, 0, len);

            }
            System.out.println("数据都写回到了浏览器");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (server != null) {
                    server.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
