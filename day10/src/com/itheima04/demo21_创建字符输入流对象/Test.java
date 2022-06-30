package com.itheima04.demo21_创建字符输入流对象;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        //注意:创建一个输入流对象时，必须传入文件路径，且该路径下，如果没有该文件,会抛出文件不存在异常。

        //FileReader(File file)：创建文件输入流以读取，由指定的File对象表示要连接的文件。
        File f = new File("day10\\resouce\\demo21\\a.txt");
        FileReader fr = new FileReader(f);

        //FileReader(String name)：创建文件输入流以读取，由指定的文件路径名表示要连接的文件。
        FileReader fr2 = new FileReader("day10\\resouce\\demo21\\b.txt");

    }
}
