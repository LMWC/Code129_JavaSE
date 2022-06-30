package com.itheima04.demo20_字符输出流写出换行;

import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        //Windows系统里，每行结尾是 回车+换行 ，即＼ r ＼ n；
        //Unix系统里，每行结尾只有换行 ，即＼ n；
        //Mac系统里，每行结尾是 回车 ，即\r。从 Mac OS X开始与Linux统一。

        FileWriter fw = new FileWriter("day10\\resouce\\demo20\\a.txt");
        fw.write("你");
        fw.write("\r\n");
        fw.write("好");
        fw.close();

    }
}
