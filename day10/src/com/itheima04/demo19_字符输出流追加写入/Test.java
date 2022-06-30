package com.itheima04.demo19_字符输出流追加写入;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        //public FileWriter(File file, boolean append):创建文件输出流以写入由指定的 File对象表示的文件。
        //append的值，true 表示追加数据，false 表示清空原有数据。
        File f = new File("day10\\resouce\\demo19\\a.txt");
        FileWriter fw = new FileWriter(f, true);
        fw.write("黑");
        fw.write("马");
        fw.write("程");
        fw.write("序");
        fw.write("员");
        fw.close();

        //public FileWriter(String name, boolean append):创建文件输出流以指定的名称写入文件,append参数同上。
        FileWriter fw2 = new FileWriter("day10\\resouce\\demo19\\b.txt",true);
        fw2.write("传智教育");
        fw2.close();
    }
}
