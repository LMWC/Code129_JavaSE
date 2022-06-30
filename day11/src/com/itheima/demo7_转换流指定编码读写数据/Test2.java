package com.itheima.demo7_转换流指定编码读写数据;

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
        //将GBK文件转换为utf-8格式文件。

        //以BGK字符集读数据
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day11\\resouce\\demo7\\content_GBK3.txt"),"gbk");

        //以UTF8字符集写数据
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day11\\resouce\\demo7\\content_GBK3ToUTF8.txt"),"utf8");

        int ch =-1;
        while ((ch=isr.read())!=-1){
            osw.write(ch);
        }

        //关流
        isr.close();
        osw.close();
    }
}
