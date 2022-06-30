package com.homework.work02_Stream流.题目一;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//void forEach(Consumer<? super T> action)

public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("张三丰", "王思聪", "张飞", "刘晓敏", "张靓颖"));
        list.stream().forEach(s->{
            System.out.println(s);
        });
    }
}
