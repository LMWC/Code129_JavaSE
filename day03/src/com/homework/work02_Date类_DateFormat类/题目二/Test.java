package com.homework.work02_Date类_DateFormat类.题目二;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws Exception {
        //创建Scanner对象
        Scanner sc = new Scanner(System.in);

        //创建SimpleDateFormat对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        //接收第1个生日
        System.out.println("请输入第1个生日（yyyy-MM-dd）");
        String dateStr1 = sc.nextLine();

        //判断是否早于当前日期
        Date birthday1 = sdf.parse(dateStr1);
        if (birthday1.after(new Date())) {
            System.out.println("生日必须早于当前日期！");
            return;
        }

        //接收第2个生日
        System.out.println("请输入第2个生日（yyyy-MM-dd）");
        String dateStr2 = sc.nextLine();

        //判断是否早于当前日期
        Date birthday2 = sdf.parse(dateStr2);
        if (birthday2.after(new Date())) {
            System.out.println("生日必须早于当前日期！");
            return;
        }

        //打印结果
        if (birthday1.before(birthday2)) {
            System.out.println("第一个生日大于第二个生日");
        } else {
            System.out.println("第一个生日小于第二个生日");
        }
    }
}
