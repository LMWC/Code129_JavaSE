package com.homework.work01_IO流.题目二;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Demo {

    public static void main(String[] args) throws IOException {
        //声明字符输入流对象
        Reader reader = new FileReader("day16/files/student.txt");

        //按字符读取文件并打印在控制台
        int c;
        while ((c = reader.read()) != -1) {
            System.out.print((char)c); //不要使用 println
        }

        //释放资源
        reader.close();
    }
}
