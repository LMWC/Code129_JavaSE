package com.homework.work03_属性集.题目一;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;
import java.util.Set;

public class Demo {

    public static void main(String[] args) throws IOException {
        // 声明Properties对象
        Properties pro = new Properties();
        // 添加属性
        pro.setProperty("品名", "Iphone11 Pro Max");
        pro.setProperty("颜色", "暗夜绿");
        pro.setProperty("存储容量", "256G");
        pro.setProperty("价格", "10899");

        // 将属性写出到test2_1.txt中
        // 声明输出流对象
        Writer writer = new FileWriter("day16/files/test2_1.txt");
        Set<String> propertyNames = pro.stringPropertyNames();
        for (String propertyName : propertyNames) {
            writer.write(propertyName + "=" + pro.getProperty(propertyName));
            writer.write("\n");
        }

        //释放资源
        writer.close();
    }
}
