package com.homework.work02_Date类_DateFormat类.题目三;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws Exception {
        //创建SimpleDateFormat对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");

        //将当前时间转换成指定格式
        String result = sdf.format(new Date());

        //打印结果
        System.out.println(result);
    }
}
