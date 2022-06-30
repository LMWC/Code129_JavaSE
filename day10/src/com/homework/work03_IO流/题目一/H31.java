package com.homework.work03_IO流.题目一;

import java.io.*;

public class H31 {

    public static void main(String[] args) throws IOException {
        //创建输入流
        InputStream is = new FileInputStream("day16/files/file1.txt");

        //创建输出流
        OutputStream os = new FileOutputStream("day16/files/file1_copy.txt");

        //按字节循环读写
        int b;
        while ((b = is.read()) != -1) {
            os.write(b);
        }

        //释放资源
        os.close();
        is.close();
    }
}
