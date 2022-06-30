package com.itheima03.demo10_常用方法;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        //注意:字节流写出数据的时候，会直接将字节数据写出到文件中。

        //创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("day10\\resouce\\demo10\\a.txt");

        //public void write(int b)：将指定的字节写入此输出流。
        fos.write(97);
        fos.write(98);
        fos.write(99);

        //public void write(byte[] b)：将 b.length字节从指定的字节数组写入此输出流。
        byte[] bys = {100, 101, 102};
        fos.write(bys);


        //public void write(byte[] b, int off, int len)：从指定字节数组,按照偏移量写入len个字节。
        byte[] bys2 = {103, 104, 105};
        fos.write(bys2, 0, 2);


        //public void flush()：刷新此输出流并强制任何缓冲的输出字节被写出。
        //理解:将内存中，剩余的数据刷出到文件中。字节流中体现不明显。
        fos.flush();
        //public void close()：关闭此输出流并释放与此流相关联的任何系统资源。
        //关闭流对象，关闭资源(该方法执行前，会先执行flush方法)，必须执行。
        fos.close();

    }
}
