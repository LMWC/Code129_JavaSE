package com.homework.work03_属性集.题目二;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;
import java.util.Set;

public class Demo {

    public static void main(String[] args) throws IOException {
        // 定义properties对象
        Properties pro = new Properties();

        // 声明输入流对象
        // 使用字节输入流可能会出现中文乱码的情况，这里先使用字符输入流
        Reader reader = new FileReader("day16/files/test2_1.txt");

        // 读取文件中的属性
        pro.load(reader);

        // 遍历并打印键值对
        Set<String> propertyNames = pro.stringPropertyNames();
        for (String propertyName : propertyNames) {
            System.out.println(propertyName + "=" + pro.get(propertyName));
        }

        //释放资源
        reader.close();
    }
}
