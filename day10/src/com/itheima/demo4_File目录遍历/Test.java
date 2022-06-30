package com.itheima.demo4_File目录遍历;

import java.io.File;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //当前项目路径
        File f = new File(".\\");

        //获取目录下所有的文件或目录路径
        //public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。
        String[] names = f.list();
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("-------");
        //public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。
        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(file);
        }

    }
}
