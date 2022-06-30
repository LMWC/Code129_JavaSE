package com.homework.work01_TCP通信.题目三;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    /**
     *  服务器
     *
     * @param args
     */
    public static void main(String[] args) throws Exception {
        //1. 创建 ServerSocket 并绑定端口 8888
        ServerSocket serverSocket = new ServerSocket(8888);

        //2. 循环接收客户端发送的请求，并返回 Socket 对象
        while (true) {
            Socket socket = serverSocket.accept();

            /**
             * GET /day12/web/index.html HTTP/1.1
             * Host: 127.0.0.1:9999
             * Connection: keep-alive
             * Upgrade-Insecure-Requests: 1
             * User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.116 Safari/537.36
             * Sec-Fetch-Dest: document
             * Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,;
             */
            //3. 从客户端发送的数据中提取要访问的资源
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line = br.readLine();
            String resource = line.split(" ")[1].substring(1);
            System.out.println("客户端请求的资源名称：" + resource);

            //从 Socket 中获得输出流
            OutputStream os = socket.getOutputStream();
            os.write("HTTP/1.1 200 OK\r\n".getBytes());
            os.write("Content-Type:text/html\r\n".getBytes());
            os.write("\r\n".getBytes());

            //4. 根据获取的资源名称，从本地磁盘中读取并响应给客户端
            InputStream localIs = new FileInputStream(resource);
            byte[] buffer = new byte[1024 * 8];
            int len;
            while ((len = localIs.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }

            //5. 释放资源
            localIs.close();
            os.close();
            is.close();
            socket.close();
        }
    }
}
