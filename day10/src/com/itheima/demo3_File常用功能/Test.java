package com.itheima.demo3_File常用功能;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        //注意:如果该路径已经存中，直接创建失败。

        //创建功能
        //public boolean createNewFile()：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件，该文件的父级目录需要先存在。
        //注意:创建文件的时候，该文件的父目录必须存中，否则报错。
        File f1 = new File("day10\\resouce\\demo3\\a.txt");
        System.out.println("createNewFile:" + f1.createNewFile());

        //public boolean mkdir()：创建由此File表示的目录，该目录的父级目录需要先存在。
        File f2 = new File("day10\\resouce\\demo3\\a\\b");
        //注意:创建单级目录的时候，如果父目录不存在，创建失败。不会报错。
        System.out.println("mkdir：" + f2.mkdir());

        //public boolean mkdirs()：创建由此File表示的目录，包括任何必需但不存在的父目录。
        //注意:mkdirs方法，创建目录的时候，如果父目录不存在，直接将所有的父目录全部创建出来。
        File f3 = new File("day10\\resouce\\demo3\\c\\d\\e");
        System.out.println("mkdirs:" + f3.mkdirs());
    }
}
