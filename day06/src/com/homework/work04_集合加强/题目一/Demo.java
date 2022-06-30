package com.homework.work04_集合加强.题目一;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a","f","b","c","a","d");

        //使用HashSet对list进行去重,此处使用LinkedHashSet是因为可以保留顺序
        //如果不在乎顺序，使用HashSet也可
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.addAll(list);
        System.out.println(set);
    }
}
