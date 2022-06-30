package com.homework.work01_Collections类.题目一;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo {
    public static void main(String[] args) {

        //定义一个可以存储“整数”的集合，并存储一些数据。
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9);
        System.out.println("初始顺序："+list);
        //打乱顺序
        Collections.shuffle(list);
        System.out.println("打乱顺序："+list);
        //升序排序
        Collections.sort(list);
        System.out.println("升序排序:"+list);
        //降序排序
        //定义比较器
        Comparator<Integer> desc = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //o1-o2是升序，反过来即降序
                return o2-o1;
            }
        };
        Collections.sort(list, desc);
        System.out.println("降序排序:"+list);
    }
}
