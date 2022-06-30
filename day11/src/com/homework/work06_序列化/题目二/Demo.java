package com.homework.work06_序列化.题目二;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Demo {

    public static void main(String[] args) throws Exception {
        //创建反序列化对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day17/files/test5_1.txt"));

        //读取
        Student stu = (Student)ois.readObject();

        //打印结果
        System.out.println(stu);

        //释放资源
        ois.close();
    }
}