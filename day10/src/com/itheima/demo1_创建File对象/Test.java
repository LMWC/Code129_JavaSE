package com.itheima.demo1_创建File对象;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        //public File(String pathname):通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。
        File f1 = new File("E:\\forteach\\javase2_129\\javase2_code_129\\day10\\resouce\\demo1");
        System.out.println(f1);

        //public File(String parent, String child):从父路径名字符串和子路径名字符串创建新的 File实例。
        String p = "E:\\forteach\\javase2_129\\javase2_code_129\\day10\\resouce";
        File f2 = new File(p, "demo1");
        System.out.println(f2);

        //public File(File parent, String child):从父抽象路径名和子路径名字符串创建新的 File实例。
        File fp = new File("E:\\forteach\\javase2_129\\javase2_code_129\\day10\\resouce");
        File f3 = new File(fp, "demo1");
        System.out.println(f3);
    }
}
