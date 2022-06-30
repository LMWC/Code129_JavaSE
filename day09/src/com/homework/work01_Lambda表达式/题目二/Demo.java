package com.homework.work01_Lambda表达式.题目二;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        // 1. 存储数据
        List<String> list = new ArrayList<>(Arrays.asList("cab", "bac", "acb", "cba", "bca", "abc"));

        // 2. 排序
        Collections.sort(list, (a, b) -> b.compareTo(a));

        // 3. 打印
        System.out.println(list);

        /*
        还可以这么做，更简洁，不过跟题目要求不符
        // 1. 存储数据
        List<String> list = new ArrayList<>(Arrays.asList("cab", "bac", "acb", "cba", "bca", "abc"));
        // 2. 排序     倒序     遍历打印
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        */
    }
}
