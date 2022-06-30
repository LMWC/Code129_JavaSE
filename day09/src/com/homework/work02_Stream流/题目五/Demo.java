package com.homework.work02_Stream流.题目五;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)

public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(
                Arrays.asList("王佳乐", "张三丰", "王思聪", "张飞", "刘晓敏", "张靓颖", "王敏"));
        // 合并两个流
        Stream.concat(
                list.stream().filter(s -> s.startsWith("张")),
                list.stream().filter(s -> s.startsWith("王"))
        ).forEach(s->{
            System.out.println(s);
        });

    }
}
