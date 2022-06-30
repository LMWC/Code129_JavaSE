package com.itheima.demo11_commonsio;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        //IOUtils:位于org.apache.commons.io的工具类，封装了对于IO的读写方法。
        //static int copy(InputStream in,OutputStream out):把in读取的内容写出到out指定的路径中，返回拷贝的字节个数(适合2GB以下)
        FileInputStream fis = new FileInputStream("day11\\resouce\\demo11\\yuan.txt");
        FileOutputStream fos = new FileOutputStream("day11\\resouce\\demo11\\mudidi.txt");
        IOUtils.copy(fis,fos);
        fis.close();
        fos.close();


        //static long copyLarge(InputStream in,OutputStream out):把in读取的内容写出到out指定的路径中，返回拷贝的字节个数(适合2GB以上)
        FileInputStream fis2 = new FileInputStream("day11\\resouce\\demo11\\yuan.txt");
        FileOutputStream fos2 = new FileOutputStream("day11\\resouce\\demo11\\mudidi2.txt");
        IOUtils.copyLarge(fis2,fos2);
        fis2.close();
        fos2.close();


        //FileUtils:位于org.apache.commons.io的工具类，封装了对于文件的读写方法。
        //static void copyFileToDirectory(final File srcFile,final File destFile) :将srcFile文件拷贝到destFile目录下。
        FileUtils.copyFileToDirectory(new File("day11\\resouce\\demo11\\yuan.txt"),new File("day11\\resouce\\demo11\\a"));

        //static void copyDirectoryToDirectory(File file1 ,File file2 ):将file1目录拷贝到file2目录下。
        FileUtils.copyDirectoryToDirectory(new File("day11\\resouce\\demo11\\a"),new File("day11\\resouce\\demo11\\b"));
    }
}
