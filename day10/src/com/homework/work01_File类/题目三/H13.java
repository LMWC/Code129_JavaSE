package com.homework.work01_File类.题目三;

import java.io.File;

public class H13 {
    public static void main(String[] args) {
        File file = new File("D:\\多级目录");
        File[] files = file.listFiles();
        // 本题并没有要求遍历任意级别的目录结构，就处理一层即可，后面有递归遍历多层的练习
        for (File f : files) {
            if (f.isFile()) {
                System.out.println("【文件】" + f.getAbsolutePath());
            } else if (f.isDirectory()) {
                System.out.println("【目录】" + f.getAbsolutePath());
            }
        }
    }
}
