package com.itheima.demo10_打印流;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class Test {
    public static void main(String[] args) throws IOException {
        //public PrintStream(String fileName):使用指定的文件名创建一个新的打印流
        PrintStream ps = new PrintStream("day11\\resouce\\demo10\\a.txt");

        //public void print(Object o)  写出内容
        ps.print("你好");
        ps.print("--------");
        //public void println()   写出一个换行。
        ps.println();
        //public void println(Object o) 写出内容并换行
        ps.println("你好");
        ps.println("--------");

        //关流
        ps.close();

    }
}
