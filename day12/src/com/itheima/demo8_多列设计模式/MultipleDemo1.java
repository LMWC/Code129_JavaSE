package com.itheima.demo8_多列设计模式;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//通用对象
public class MultipleDemo1 {
    public static final int count = 5;
    public static List<MultipleDemo1> list = new ArrayList<>();

    //静态代码块
    static {
        //MultipleDemo1 one = new MultipleDemo1();
        //MultipleDemo1 two = new MultipleDemo1();
        //MultipleDemo1 three = new MultipleDemo1();
        //MultipleDemo1 four = new MultipleDemo1();
        //MultipleDemo1 five = new MultipleDemo1();
        //Collections.addAll(list, one, two, three, four, five);

        for (int i = 0; i < count; i++) {
            list.add(new MultipleDemo1());
        }
    }

    private MultipleDemo1() {
    }

    public static MultipleDemo1 getInstance() {
        Random r = new Random();
        int index = r.nextInt(count);//num:0 ~ count-1
        return list.get(index);
    }
}
