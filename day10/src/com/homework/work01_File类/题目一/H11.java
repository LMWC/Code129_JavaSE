package com.homework.work01_File类.题目一;

import java.io.File;

public class H11 {
    public static void main(String[] args) {
        // 注意 \\ 要写两个，第一个是转义字符，第二个是真正的 \
        // 也可以将 \\ 替换为 /
        File file1 = new File("d:\\test1.txt");
        File file2 = new File("d:\\测试目录");

        // 1. 获取打印file1和file2的绝对路径
        System.out.println("file1 的绝对路径："+file1.getAbsolutePath());
        System.out.println("file2 的绝对路径："+file2.getAbsolutePath());
        // 2. 获取打印file1和file2的文件名和目录名
        System.out.println("file1 文件名："+file1.getName());
        System.out.println("file1 目录名："+file1.getParent()); // parent 为上级目录
        System.out.println("file2 文件名："+file2.getName());
        System.out.println("file2 目录名："+file2.getParent());
        // 3. 获取打印file1和file2的文件大小
        System.out.println("file1 大小："+file1.length());
        System.out.println("file2 大小："+file2.length());
        // 4. 分别判断file1和file2是否存在
        System.out.println("file1 存在吗？"+file1.exists());
        System.out.println("file2 存在吗？"+file2.exists());
        // 5. 分别判断file1和file2是否是文件？是否是目录？
        System.out.printf("file1 是否是文件 %b 是否是目录 %b\n", file1.isFile(), file1.isDirectory());
        System.out.printf("file2 是否是文件 %b 是否是目录 %b\n", file2.isFile(), file2.isDirectory());
    }
}