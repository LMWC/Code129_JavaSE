package com.homework.work01_Object类.题目二;

public class Test {
    public static void main(String[] args) {
        //创建两个学生对象
        Student stu1 = new Student("张三", "男", 18);
        Student stu2 = new Student("张三", "男", 18);

        //打印结果
        System.out.println(stu1.equals(stu2));
    }
}
