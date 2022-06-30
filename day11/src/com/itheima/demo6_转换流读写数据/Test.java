package com.itheima.demo6_转换流读写数据;

import java.io.*;

public class Test {
    public static void main(String[] args) throws Exception {
        //转换输入流构造方法：InputStreamReader(InputStream in): 创建使用默认字符集的字符输入流。
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day11\\resouce\\demo6\\a.txt"));

        //转换输出流构造方法：OutputStreamWriter(OutputStream in): 创建使用默认字符集的字符输出流
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day11\\resouce\\demo6\\b.txt"));
        //读字符
        int ch = isr.read();
        System.out.println((char) ch);
        //写字符
        osw.write("你好啊");
        isr.close();
        osw.close();
    }
}
