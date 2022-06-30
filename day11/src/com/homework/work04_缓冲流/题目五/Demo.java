package com.homework.work04_缓冲流.题目五;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) throws IOException {
        //声明字符缓冲输入流
        BufferedReader br = new BufferedReader(new FileReader("day17/files/test3_4.txt"));

        //声明集合
        List<Student> stuList = new ArrayList<>();

        //循环读取
        String line;
        while ((line = br.readLine()) != null) {
            //创建学生对象
            Student stu = new Student();

            //切割字符串
            String[] split = line.split(",");

            //封装到对象中
            stu.setName(split[0]);
            stu.setGender(split[1]);
            stu.setAge(Integer.parseInt(split[2])); //转换类型
            stu.setScore(Integer.parseInt(split[3])); //转换类型

            //添加到集合中
            stuList.add(stu);
        }

        //打印结果
        for (Student student : stuList) {
            System.out.println(student);
        }

        //释放资源
        br.close();
    }
}
