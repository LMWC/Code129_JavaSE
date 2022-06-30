package com.homework.work02_Stream流.题目三;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Stream<T> filter(Predicate<? super T> predicate);
//long count();

public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("张三丰", "王思聪", "张飞", "刘晓敏", "张靓颖"));

        System.out.println(list.stream().filter(s -> s.startsWith("张")).count());
    }
}
