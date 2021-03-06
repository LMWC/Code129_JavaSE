package com.itheima01_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
1.概述
	java.utils.Collections是集合工具类，用来对集合进行操作。
2.常用方法
	public static void shuffle(List<?> list) :打乱集合顺序。
	public static <T> void sort(List<T> list):将集合中元素按照默认规则排序。

需求:演示集合工具类中的功能
 */
public class Test_01_常用功能 {
    public static void main(String[] args) {

        //创建集合
        List<Integer> list = new ArrayList<>();
        //添加数据
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("操作前:" + list);

        //public static void shuffle(List<?> list) :打乱集合顺序。
        Collections.shuffle(list);
        System.out.println("打乱后:" + list);

        //public static <T> void sort(List<T> list):将集合中元素按照默认规则排序。
        Collections.sort(list);
        System.out.println("排序后:" + list);

    }
}
