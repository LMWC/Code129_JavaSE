package com.itheima.demo3_File常用功能;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        File f1 = new File("day10\\resouce\\demo3\\a.txt");
        File f2 = new File("day10\\resouce\\demo3\\b.txt");
        //获取功能
        //public String getAbsolutePath()：返回此File的绝对路径名字符串。
        System.out.println(f1.getAbsolutePath());
        System.out.println(f2.getAbsolutePath());

        //public String getPath()：将此File转换为路径名字符串。
        System.out.println(f1.getPath());
        System.out.println(f2.getPath());

        //public String getName()：返回由此File表示的文件或目录的名称。
        System.out.println(f1.getName());
        System.out.println(f2.getName());


        //public long length()  	：返回由此File表示的文件的长度。
        //注意:该方法用于目录的路径，也可能会有数值，但不是该目录的大小，使用没有意义的。
        System.out.println(f1.length());
        System.out.println(f2.length());
    }
}
