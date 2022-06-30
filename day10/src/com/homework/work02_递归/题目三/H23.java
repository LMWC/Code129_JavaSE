package com.homework.work02_递归.题目三;

import java.io.File;

public class H23 {
    public static void main(String[] args) {
        printFile(new File("d:/a"));
    }

    static void printFile(File fileOrDir) {
        // 是目录
        if (fileOrDir.isDirectory()) {
            // 继续遍历子目录和文件
            for (File f : fileOrDir.listFiles()) {
                printFile(f);
            }
        }
        // 是文件，打印绝对路径
        else if (fileOrDir.isFile()) {
            System.out.println(fileOrDir.getAbsolutePath());
        }
    }
}
