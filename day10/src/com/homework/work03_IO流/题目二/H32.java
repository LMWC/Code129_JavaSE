package com.homework.work03_IO流.题目二;

import java.io.*;

public class H32 {

    public static void main(String[] args) throws IOException {
        //创建输入流
        InputStream is = new FileInputStream("day16/files/file2.txt");

        //创建输出流
        OutputStream os = new FileOutputStream("day16/files/file2_copy.txt");

        //按每千字节循环读写
        byte[] buffer = new byte[1000];
        int len;
        while ((len = is.read(buffer)) != -1) {
            os.write(buffer, 0, len);
        }

        //释放资源
        os.close();
        is.close();
    }
}
