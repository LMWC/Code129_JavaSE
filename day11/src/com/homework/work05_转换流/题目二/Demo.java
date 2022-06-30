package com.homework.work05_转换流.题目二;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

    //请定义一个输入转换流对象：InputStreamReader，使用GBK编码读取“test4_1.txt”文件的内容，并打印。
    public static void main(String[] args) throws IOException {
        //定义输入转换流
        InputStreamReader isr = new InputStreamReader(
                new FileInputStream("day17/files/test4_1.txt"), "GBK");

        //读取
        char[] buffer = new char[1024 * 8];
        int len = isr.read(buffer); //因为内容不多，读取一次就够了

        //打印结果
        System.out.println(new String(buffer, 0, len));

        //释放资源
        isr.close();
    }
}
