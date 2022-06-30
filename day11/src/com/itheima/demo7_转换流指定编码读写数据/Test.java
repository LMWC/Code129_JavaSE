package com.itheima.demo7_转换流指定编码读写数据;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        //InputStreamReader(InputStream in,String charsetName): 创建指定字符集的字符输入流。
        //码表不一致的内容
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day11\\resouce\\demo7\\content_GBK.txt"), "gbk");

        int ch = -1;
        while ((ch = isr.read()) != -1) {
            System.out.println((char) ch);
        }
        //码表一致的内容
        InputStreamReader isr2 = new InputStreamReader(new FileInputStream("day11\\resouce\\demo7\\content_UTF8.txt"),"utf8");
        int ch2 = -1;
        while ((ch2 = isr2.read()) != -1) {
            System.out.println((char) ch2);
        }

        //关流
        isr.close();
        isr2.close();

        //OutputStreamWriter(OutputStream in,String charsetName): 创建指定字符集的字符输出流。
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day11\\resouce\\demo7\\content_GBK2.txt"), "gbk");
        osw.write("我是GBK的好人");

        OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream("day11\\resouce\\demo7\\content_UTF82.txt"), "utf8");
        osw2.write("我是utf8的好人");

        //关流
        osw.close();
        osw2.close();

    }
}
