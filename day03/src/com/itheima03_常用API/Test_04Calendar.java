package com.itheima03_常用API;

import java.util.Calendar;

/*
1.概述:
    java.util.Calendar类表示一个“日历类”，可以进行日期运算。
2.注意事项：
      日历对象中的星期是从1-7来表示，1表示星期天。
      日历对象中的月份是从0-11来表示，0表示一月份。
3.构造方法:
    Calendar类是一个抽象类，需要使用其子类java.util.GregorianCalendar创建对象。
    Calendar提供了一个静态方法getInstance()可以获取GregorianCalendar对象
    public static Calendar getInstance()   获取GregorianCalendar对象，以Calendar类型返回。
4.常用方法
    public int get(int field)  获取某个字段的值。
    public void set(int field,int value)  设置某个字段的值
    public void add(int field,int amount)  为某个字段增加/减少指定的值
*/
public class Test_04Calendar {
    public static void main(String[] args) {
        //获取Calendar子类对象
        Calendar c = Calendar.getInstance();
        //抽取方法:Ctrl+Alt+M
        showCalendar(c);

        //public void set(int field,int value)
        //c.set(Calendar.MONTH,5);
        c.set(Calendar.MONTH,12);
        showCalendar(c);

        //public void add(int field,int amount)
        //c.add(Calendar.MONTH,1);
        c.add(Calendar.MONTH,-1);
        showCalendar(c);
    }

    public static void showCalendar(Calendar c) {
        //获取时间信息
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);
        month++;
        System.out.println(year + "年" + month + "月" + day + "日" + hour + ":" + minute + ":" + second);
        //展示星期
        int week = c.get(Calendar.DAY_OF_WEEK);
        String[] weeks = {"星期天", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        week--;
        System.out.println(weeks[week]);
    }
}
