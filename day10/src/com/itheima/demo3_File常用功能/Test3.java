package com.itheima.demo3_File常用功能;

import java.io.File;

public class Test3 {
    public static void main(String[] args) {
        File f1 = new File("day10\\resouce\\demo3\\a");
        File f2 = new File("day10\\resouce\\demo3\\b");
        File f3 = new File("day10\\resouce\\demo3\\a.txt");

        //判断功能
        //public boolean exists()：此File表示的文件或目录是否实际存在。
        System.out.println(f1.exists());//true
        System.out.println(f2.exists());//false
        System.out.println(f3.exists());//true

        //public boolean isDirectory()：此File表示的是否为目录。
        System.out.println(f1.isDirectory());//true
        System.out.println(f2.isDirectory());//false
        System.out.println(f3.isDirectory());//false

        //public boolean isFile()：此File表示的是否为文件。
        System.out.println(f1.isFile());//false
        System.out.println(f2.isFile());//false
        System.out.println(f3.isFile());//true

    }
}
