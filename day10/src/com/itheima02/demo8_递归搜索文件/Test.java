package com.itheima02.demo8_递归搜索文件;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        //使用递归搜索指定目录及其子目录中的所有.java 文件。
        File f = new File(".\\");
        findJava(f);
    }

    public static void findJava(File f) {
        // 1.获取目录下所有目录和文件路径
        //判断如果是目录，获取所有的路径（避免空指针）
        File[] files = null;
        if (f != null && f.isDirectory()) {
            files = f.listFiles();
        } else {
            //不是目录， 结束方法
            return;
        }

        // 2.遍历所有的路径名(有可能是目录路径，也有可能是文件路径)
        for (File file : files) {
            // 3.判断如果是目录，则递归调用，如果是文件且以.java结尾，则打印
            if (file.isDirectory()) {
                findJava(file);
            } else if (file.isFile() && file.getName().endsWith(".java")) {
                System.out.println(file.getAbsolutePath());
            }
        }
    }
}
