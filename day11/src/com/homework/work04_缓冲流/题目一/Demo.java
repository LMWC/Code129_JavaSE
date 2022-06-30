package com.homework.work04_缓冲流.题目一;

import java.io.*;

public class Demo {

    public static void main(String[] args) throws IOException {
        //创建字节缓冲输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:/视频.itcast"));
        //创建字节缓冲输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:/视频.itcast"));

        //声明缓冲字节数组
        byte[] buffer = new byte[1024 * 8];
        //声明记录读取长度的变量
        int len;

        //循环读写
        while ((len = bis.read(buffer)) != -1) {
            bos.write(buffer, 0, len);
        }

        //释放资源
        bos.close();
        bis.close();
    }
}
