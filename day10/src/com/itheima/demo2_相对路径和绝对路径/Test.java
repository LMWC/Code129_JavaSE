package com.itheima.demo2_相对路径和绝对路径;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        //相对性：java中 一般 相对路径是相对于项目路径存中的。

        //相对路径
        File f1 = new File("day10\\resouce\\demo2");
        System.out.println(f1.getAbsolutePath());

        //当前(相对)路径：项目路径
        File f2 = new File("");
        System.out.println(f2.getAbsolutePath());

        //当前(相对)路径：项目路径
        File f3 = new File(".\\");
        System.out.println(f3.getAbsolutePath());

        //上级(相对)路径：项目路径的上一级路径
        File f4 = new File("..\\");
        System.out.println(f4.getAbsolutePath());

        //绝对路径  从盘符开始指定的路径
        File f5 = new File("E:\\forteach\\javase2_129\\javase2_code_129\\day10\\resouce\\demo2");
        System.out.println(f5);
    }
}
