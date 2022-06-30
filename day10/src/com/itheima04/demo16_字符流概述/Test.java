package com.itheima04.demo16_字符流概述;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        //为什么需要字符流？
        //字节读取字符收据并展示，会出现乱码。
        //使用字节流读取字符数据，并展示的过程中，可能会由于没有读取到字符对应的完整的字节数据，而导致出现乱码的问题。
        //使用字节流读取中文数据
        FileInputStream fis = new FileInputStream("day10\\resouce\\demo16\\a.txt");
        //单个字节读取
        //System.out.println((char)fis.read());
        //数组读取
        int len = -1;
        byte[] bys = new byte[4];
        len = fis.read(bys);
        System.out.println(new String(bys,0,len));
        len = fis.read(bys);
        System.out.println(new String(bys,0,len));

    }
}
