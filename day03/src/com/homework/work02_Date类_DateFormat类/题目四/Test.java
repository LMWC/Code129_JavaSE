package com.homework.work02_Date类_DateFormat类.题目四;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws Exception {
        //创建Scanner对象
        Scanner sc = new Scanner(System.in);

        //接收用户输入
        System.out.println("请输入日期（yyyy-MM-dd）");
        String dateStr = sc.nextLine();

        //将字符串日期转换成Date对象
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf1.parse(dateStr);

        //将Date对象转换成指定格式的字符串
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        String result = sdf2.format(date);

        //打印结果
        System.out.println(result);
    }
}
