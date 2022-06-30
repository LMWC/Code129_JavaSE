package com.itheima03.demo12_字节输出流写出换行;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        //Windows系统里，每行结尾是 回车+换行 ，即＼ r ＼ n；
        //Unix系统里，每行结尾只有换行 ，即＼ n；
        //Mac系统里，每行结尾是 回车 ，即＼ r。从 Mac OS X开始与Linux统一。

        //注意:字符数据用字节流写出，需要将其数据先转换为字节数组，写出。

        FileOutputStream fos = new FileOutputStream("day10\\resouce\\demo12\\a.txt");
        fos.write(97);
        //输出换行
        byte[] bys = "\r\n".getBytes();
        fos.write(bys);
        fos.write(98);
        fos.close();
    }
}
