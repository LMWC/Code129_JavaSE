package com.homework.work02_异常.题目二;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        String[] arr = {"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
        System.out.print("请输入一个1-7的值:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        //从数组中取出对应的星期几
        try{
            String week = arr[num - 1];
            System.out.println(week);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("输入错误！！");
        }
    }
}
