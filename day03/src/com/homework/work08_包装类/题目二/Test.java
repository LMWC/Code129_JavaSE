package com.homework.work08_包装类.题目二;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner sc = new Scanner(System.in);

        //接收用户输入
        System.out.println("请输入姓名：");
        String name = sc.nextLine();

        System.out.println("请输入年龄：");
        String ageStr = sc.nextLine();

        System.out.println("请输入身高：");
        String heightStr = sc.nextLine();

        System.out.println("请输入婚否："); //必须输入 true 或 false
        String flagStr = sc.nextLine();

        System.out.println("请输入性别：");
        String genderStr = sc.nextLine();

        //转换
        int age = Integer.parseInt(ageStr);
        double height = Double.parseDouble(heightStr);
        boolean flag = Boolean.parseBoolean(flagStr);
        char gender = genderStr.charAt(0);

        //封装
        Student stu = new Student(name, age, height, false, gender);

        //打印
        System.out.println(stu);
    }
}
