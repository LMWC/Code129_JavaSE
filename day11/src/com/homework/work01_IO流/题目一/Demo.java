package com.homework.work01_IO流.题目一;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) throws IOException {
        // 定义集合
        List<Student> stuList = new ArrayList<>();

        // 创建两个学生对象并添加到集合中
        stuList.add(new Student("张三", "男", 20, 88));
        stuList.add(new Student("李四", "女", 19, 99));

        // 遍历集合，并将集合中的学生对象信息写入到 student.txt 文件中
        // 声明字符输出流对象
        Writer writer = new FileWriter("day16/files/student.txt");
        for (Student student : stuList) {
            writer.write(
                    student.getName() + "," +
                            student.getGender() + "," +
                            student.getAge() + "," +
                            student.getScore());
            writer.write("\n");
        }

        //释放资源
        writer.close();
    }
}
