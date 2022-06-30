package com.homework.work04_缓冲流.题目四;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) throws IOException {
        //定义集合
        List<Student> stuList = new ArrayList<>();

        //创建学生对象并添加到集合中
        stuList.add(new Student("迪丽热巴", "女", 18, 99));
        stuList.add(new Student("古力娜扎", "女", 19, 98));
        stuList.add(new Student("周杰伦", "男", 20, 88));
        stuList.add(new Student("蔡徐坤", "男", 19, 78));

        //定义字符缓冲输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("day17/files/test3_4.txt"));

        //循环集合中的所有学生对象，并写出到文件中
        for (Student student : stuList) {
            bw.write(student.getName() + ", " + student.getGender() + ", " + student.getAge() + ", " + student.getScore());
            bw.newLine();//换行
        }

        //释放资源
        bw.close();
    }
}
