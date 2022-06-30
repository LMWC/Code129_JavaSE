package com.itheima.demo5_字符缓冲流特殊方法;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        //BufferedReader类：public String readLine(): 读一行文字，读取不到内容，返回null。
        BufferedReader br = new BufferedReader(new FileReader("day11\\resouce\\demo5\\a.txt"));
        //System.out.println(br.readLine());
        //System.out.println(br.readLine());
        //System.out.println(br.readLine());
        //System.out.println(br.readLine());
        String s = null;
        //使用s判断是否为null 不为null，代表有数据
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
        br.close();
        //BufferedWriter类：public void newLine(): 写一行行分隔符,由系统属性定义符号。
        BufferedWriter bw = new BufferedWriter(new FileWriter("day11\\resouce\\demo5\\b.txt"));
        bw.write("你");
        bw.newLine();//\r\n
        bw.write("好");
        bw.newLine();
        bw.write("啊");
        bw.close();
    }
}
