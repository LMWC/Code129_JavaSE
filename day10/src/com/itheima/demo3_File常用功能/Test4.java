package com.itheima.demo3_File常用功能;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
        File f1 = new File("day10\\resouce\\demo3\\a");
        File f2 = new File("day10\\resouce\\demo3\\b");
        File f3 = new File("day10\\resouce\\demo3\\a.txt");
        File f4 = new File("day10\\resouce\\demo3\\b.txt");

        //删除功能
        //public boolean delete()：删除由此File表示的文件或目录。
        //删目录
        //注意:删除的目录必须是一个空目录。
        System.out.println(f1.delete());
        System.out.println(f2.delete());
        //删文件
        System.out.println(f3.delete());
        System.out.println(f4.delete());



    }
}
