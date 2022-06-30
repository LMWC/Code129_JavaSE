package com.itheima03.demo11_字节输出流追加写入;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        //public FileOutputStream(File file, boolean append):创建文件输出流以写入由指定的 File对象表示的文件。
        //append的值，true 表示追加数据，false 表示清空原有数据。
        File f = new File("day10\\resouce\\demo11\\a.txt");
        FileOutputStream fos = new FileOutputStream(f,true);
        fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.close();

        //public FileOutputStream(String name, boolean append):创建文件输出流以指定的名称写入文件， append参数同上。
        FileOutputStream fos2 = new FileOutputStream("day10\\resouce\\demo11\\b.txt",true);
        fos2.write(97);
        fos2.write(98);
        fos2.write(99);
        fos2.close();
    }
}
