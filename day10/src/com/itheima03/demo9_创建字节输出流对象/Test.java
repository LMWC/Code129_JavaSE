package com.itheima03.demo9_创建字节输出流对象;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        //注意:如果要创建的文件路径的父目录不存在的，报错
        //注意:如果指定路径的文件不存在，创建字节输出流对象的时候，会自动创建该文件。
        //注意:如果指定路径的文件存在，都会将之前的文件删掉，重新创建。

        //public FileOutputStream(File file)：创建文件输出流以写入由指定的 File对象表示的文件。
        File f = new File("day10\\resouce\\demo9\\a.txt");
        FileOutputStream fos = new FileOutputStream(f);

        //public FileOutputStream(String name):创建文件输出流以指定的名称写入文件。
        FileOutputStream fos2 = new FileOutputStream("day10\\resouce\\demo9\\b.txt");

    }
}
