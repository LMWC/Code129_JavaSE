package com.homework.work02_Date类_DateFormat类.题目一;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws Exception{
        //创建Scanner对象
        Scanner sc = new Scanner(System.in);

        //接收用户输入
        System.out.println("请输入您的生日（yyyy-MM-dd）");
        String dateStr = sc.nextLine();

        //创建SimpleDateFormat对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        //判断日期是否正确
        Date birthday = sdf.parse(dateStr); //异常直接抛
        Date now = new Date();
        if (birthday.after(now)) {
            System.out.println("生日必须早于当前日期！");
            return; //结束程序
        }

        //计算来到世界xx天
        long millisecond = now.getTime() - birthday.getTime();

        long days = millisecond / 1000 / 60 / 60 / 24;
        System.out.println("您已经来到这个世界" + days + "天");
    }
}
