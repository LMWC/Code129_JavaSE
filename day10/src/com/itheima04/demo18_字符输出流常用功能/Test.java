package com.itheima04.demo18_字符输出流常用功能;

import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        //创建字符输出流对象
        FileWriter fw = new FileWriter("day10\\resouce\\demo18\\a.txt");

        //public void write(char cbuf)：将指定的字符写入此输出流。
        fw.write('黑');
        fw.write('马');
        fw.write('程');
        fw.write('序');
        fw.write('员');

        //public void write(char[] cbuf)：将 b.length字符从指定的字符数组写入此输出流。
        char[] chs = {'传', '智', '教', '育'};
        fw.write(chs);

        //public void write(char[] cbuf, int off, int len)：从指定字符数组,按照偏移量写入len个字符。
        char[] chs2 = {'深', '圳', '分', '公', '司'};
        fw.write(chs2, 0, 2);

        //public void write(String str):写出一个字符串。
        fw.write("你好啊");

        //public void write(String str, int off, int len) ，每次可以写出一个字符串的指定范围
        fw.write("广州是一家", 0, 2);

        //public void flush()：刷新此输出流并强制任何缓冲的输出字符被写出。
        //字符流中的数据，必须使用flush方法，才能刷新到指定的文件中。
        //fw.flush();

        //public void close()：关闭此输出流并释放与此流相关联的任何系统资源。
        //close方法执行前，会先调用flush方法。
        //但是，如果数据量过大，建议可以指定一个遍历，达到一定的次数，就去执行1次flush。
        fw.close();
    }
}
