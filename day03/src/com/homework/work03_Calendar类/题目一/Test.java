package com.homework.work03_Calendar类.题目一;

import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
        //创建Calendar对象
        Calendar cal = Calendar.getInstance();

        //获得年、月、日、时、分、秒并打印在控制台
        System.out.println("年: " + cal.get(Calendar.YEAR));
        System.out.println("月: " + (cal.get(Calendar.MONTH) +1));
        System.out.println("日: " + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("时: " + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("分: " + cal.get(Calendar.MINUTE));
        System.out.println("秒: " + cal.get(Calendar.SECOND));
    }
}
