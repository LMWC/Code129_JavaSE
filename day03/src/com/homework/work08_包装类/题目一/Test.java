package com.homework.work08_包装类.题目一;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner sc = new Scanner(System.in);

        //接收用户输入
        System.out.println("请输入分数：");
        String scoreStr = sc.nextLine();

        //将字符串分数转换成int类型
        int score = Integer.parseInt(scoreStr);

        //分数+5并打印在控制台
        System.out.println(score + 5);
    }
}
