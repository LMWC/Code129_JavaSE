package com.homework.work02_异常.题目一;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        //分别从控制台接收两个整数
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个数:");
        int num1 = scanner.nextInt();

        //为了防止第二个数为0导致异常，请在计算时使用异常处理。当出现异常时，向用户打印：第二个数不能为0！！
        System.out.print("请输入第二个数:");
        int num2 = scanner.nextInt();
        //计算“第一个数 / 第二个数”的结果，并打印；
        try {
            int div = num1/num2;
            System.out.println("第一个数/第二个数="+div);
        } catch (ArithmeticException e) {
            if(num2==0) {
                System.out.println("第二个数不能为0");
            }
        }
    }
}
