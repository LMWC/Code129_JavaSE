package com.homework.work03_Set接口.题目四;

import java.util.Collections;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        //	定义一个可以存储“整数”的TreeSet对象
        TreeSet<Integer> set = new TreeSet<>();
        //	存储以下整数:30,20,50,10,30,20
        Collections.addAll(set,30,20,50,10,30,20);
        //	打印集合大小。为什么跟存入的数量不一致？
        //因为Set的集合会对重复元素进行去重，所以 仅会保存 20,30,50,10 这4个元素
        System.out.println("Set集合大小:"+set.size());
        //使用增强for遍历集合，打印大于25的元素
        System.out.println("———————使用增强for遍历集合，打印大于25的元素————————");
        for (Integer num : set) {
            if(num>25){
                System.out.println(num);
            }
        }

    }
}
