package com.homework.work03_Set接口.题目一;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        //	定义一个Set集合，并存储以下数据：刘备，关羽，张飞，刘备，张飞
        HashSet<String> set = new HashSet<>();
        Collections.addAll(set,"刘备","关羽","张飞","刘备","张飞");
        //	打印集合大小
        System.out.println("Set集合大小:"+set.size());
        //	使用迭代器遍历集合，并打印每个元素
        System.out.println("——————————————————迭代器遍历打印——————————————————");
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }

        //使用增强for遍历集合，并打印每个元素
        System.out.println("——————————————————增强for遍历集合，并打印每个元素——————————————————");
        for (String name : set) {
            System.out.println(name);
        }
    }
}
