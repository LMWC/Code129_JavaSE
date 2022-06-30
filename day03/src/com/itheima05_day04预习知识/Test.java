package com.itheima05_day04预习知识;

import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Calendar qian = Calendar.getInstance();

        Calendar hou = Calendar.getInstance();

        System.out.println(qian.before(hou));//before之前  true
        System.out.println(hou.before(qian));//           false

        System.out.println(qian.after(hou));//after之后  false
        System.out.println(hou.after(qian));//          true


        Calendar c = Calendar.getInstance();
        Date d = new Date(0L);
        c.setTime(d);
        System.out.println(c.get(Calendar.YEAR));
    }
}
