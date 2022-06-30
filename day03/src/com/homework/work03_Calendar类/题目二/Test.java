package com.homework.work03_Calendar类.题目二;

import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
        //创建Calendar对象
        Calendar cla = Calendar.getInstance();
        //设置指定日期  月份要-1，所以设置的是9
        cla.set(1949, 8, 1);

        //定义一个数组存储星期
        String[] weekArray = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};

        //获得星期值
        int week = cla.get(Calendar.DAY_OF_WEEK);

        //打印结果
        System.out.println(weekArray[week - 1]);
    }
}
