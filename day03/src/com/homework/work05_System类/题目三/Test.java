package com.homework.work05_System类.题目三;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //创建List集合
        List<Integer> list = new ArrayList<>();

        //开始时间
        long startTime = System.currentTimeMillis();

        //添加元素
        for (int i = 0; i < 10000000; i++) {
            list.add(i);
        }

        //结束时间
        long endTime = System.currentTimeMillis();

        //打印结果
        System.out.println("耗时：" + (endTime - startTime) + "毫秒");

    }
}
