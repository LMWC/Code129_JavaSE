package com.homework.work06_序列化.题目一;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo {

    public static void main(String[] args) throws IOException {
        //创建对象
        Student stu = new Student("迪丽热巴", "女", 18);

        //创建序列化对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day17/files/test5_1.txt"));

        //写出文件
        oos.writeObject(stu);

        //释放资源
        oos.close();
    }
}
