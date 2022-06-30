package com.homework.work01_File类.题目二;

import java.io.File;
import java.io.IOException;

public class H12 {
    public static void main(String[] args) throws IOException {
        // 如何查看相对目录相对的哪个呢？
        System.out.println(System.getProperty("user.dir"));


        File file1 = new File("test.txt");
        if (!file1.exists()) {
            file1.createNewFile();
        } else {
            System.out.println(file1.getAbsolutePath()+"已存在...");
        }

        File file2 = new File("一级目录");
        if (!file2.exists()) {
            file2.mkdir();
        } else {
            System.out.println(file2.getAbsolutePath()+"已存在...");
        }

        File file3 = new File("目录A/目录B/目录C");
        if (!file3.exists()) {
            file3.mkdirs();
        } else {
            System.out.println(file3.getAbsolutePath()+"已存在...");
        }
    }
}
