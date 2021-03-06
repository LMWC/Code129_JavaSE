package com.itheima03_常用API;

import java.util.Date;

/*
1.概述:
    标准基准时间:【历元(epoch):1970年1月1日00:00:00 GMT)】,也称为时间原点。
    java.util.Date类 表示自原点时间以来，特定的瞬间所对应的毫秒值。
2.构造方法:
    public Date():为运行程序时到时间原点经历毫秒值，分配的Date对象,以表示该时刻。
    public Date(long date):为到时间原点的指定毫秒值，分配的Date对象,以表示该时刻。
3.常用功能:
    public long getTime() 把日期对象转换成对应的时间毫秒值。
    public void setTime(long time) 把方法参数给定的毫秒值设置给日期对象

 */
public class Test_02Date {
    public static void main(String[] args) {
        //创建当前时间对象
        Date d = new Date();
        System.out.println(d);

        //创建指定时间对象
        Date d2 = new Date(0L);
        System.out.println(d2);

        //获取毫秒值
        System.out.println(d.getTime());
        System.out.println(d2.getTime());
        //修改毫秒值
        d.setTime(1000L);
        System.out.println(d);
    }
}
