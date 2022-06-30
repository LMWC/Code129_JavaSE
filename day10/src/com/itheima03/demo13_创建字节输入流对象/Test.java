package com.itheima03.demo13_创建字节输入流对象;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        //注意:创建一个流对象时，必须传入文件路径，且该路径下，如果没有该文件,会抛出文件不存在异常。

        //FileInputStream(File file)：创建文件输入流以读取，由指定的File对象表示要连接的文件。
        File f = new File("day10\\resouce\\demo13\\a.txt");
        FileInputStream fis = new FileInputStream(f);

        //FileInputStream(String name)：创建文件输入流以读取，由指定的文件路径名表示要连接的文件。
        FileInputStream fis2 = new FileInputStream("day10\\resouce\\demo13\\b.txt");

    }
}
