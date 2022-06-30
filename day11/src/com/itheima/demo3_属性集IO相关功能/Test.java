package com.itheima.demo3_属性集IO相关功能;

import java.io.*;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws IOException {
        //注意:
        // 1.存储的文件的后缀名一定要是properties
        // 2.在设置的FileEncoding设置properties文件不显示unicode编码。

        //创建属性集对象
        Properties p = new Properties();
        //添加数据
        p.setProperty("姓名", "张三");
        p.setProperty("年龄", "18");

        //字节流相关方法
        //public void store(OutputStream out,String comments)：用字节输出流写出键值对
        FileOutputStream fos = new FileOutputStream("day11\\resouce\\demo3\\a.properties");
        p.store(fos, "当前内容使用的是字节流存储");
        fos.close();

        //public void load(InputStream inStream)： 从字节输入流中读取键值对。
        FileInputStream fis = new FileInputStream("day11\\resouce\\demo3\\b.properties");
        p.load(fis);
        System.out.println(p);

        //字符流相关方法
        //public void store(Writer writer,String comments):用字符输出流写出键值对。
        FileWriter fw = new FileWriter("day11\\resouce\\demo3\\c.properties");
        p.store(fw,"当前内容使用的字符流存储");

        //public void load(Reader reader):从字符输入流中读取键值对。
        FileReader fr = new FileReader("day11\\resouce\\demo3\\d.properties");
        p.load(fr);
        System.out.println(p);

    }
}
