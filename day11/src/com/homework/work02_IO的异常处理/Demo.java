package com.homework.work02_IO的异常处理;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Demo {

    public static void main(String[] args) {
        //声明输出流对象
        try (Writer writer = new FileWriter("day16/files/file3.txt")) {
            //写出 HelloWorld
            writer.write("HelloWorld");
        } catch (IOException e) {
            System.out.println("程序出现异常，异常信息：" + e.getMessage());
        }
    }
}
