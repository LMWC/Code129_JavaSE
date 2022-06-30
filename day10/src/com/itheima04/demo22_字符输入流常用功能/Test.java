package com.itheima04.demo22_字符输入流常用功能;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("day10\\resouce\\demo22\\a.txt");

        //public int read():从输入流读取数据的下一个字符。
     /*   System.out.println((char)fr.read());
        System.out.println((char)fr.read());
        System.out.println((char)fr.read());
        System.out.println((char)fr.read());
        System.out.println((char)fr.read());
        //如果读到的数值是-1，代表没有字符
        System.out.println(fr.read());*/
        int ch = -1;
        //判断ch是否是-1,不是-1，读到了数据
        while ((ch=fr.read())!=-1){
            System.out.println((char)ch);
        }
        //public void close():关闭此输入流并释放与此流相关联的任何系统资源。
        fr.close();

        System.out.println("--------");
        //public int read(char[] cbuf):从输入流中读取一些字符数，并将它们存储到字符数组cbuf中。
        FileReader fr2 = new FileReader("day10\\resouce\\demo22\\a.txt");
        char[] chs = new char[2];
        int len =-1;
       /* int len = fr2.read(chs);
        System.out.println(len);
        System.out.println(Arrays.toString(chs));
        len = fr2.read(chs);
        System.out.println(len);
        System.out.println(Arrays.toString(chs));
        len = fr2.read(chs);
        System.out.println(len);
        System.out.println(Arrays.toString(chs));
        len = fr2.read(chs);
        System.out.println(len);
        System.out.println(Arrays.toString(chs));*/
        //判断len是否是-1,不是-1，读到了数据
        while ((len=fr2.read(chs))!=-1){
            //System.out.println(Arrays.toString(chs));
            System.out.println(new String(chs,0,len));
        }
    }
}
