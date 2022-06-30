package com.itheima.demo6_lambda标准格式;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author jialefei
 * @date 2022/4/26 10:11
 */
public class Test {
    public static void main(String[] args) {
        /*
        (参数类型 参数名)->{代码语句}
                ()内的语法与传统方法参数列表一致：无参数则留空，多个参数则用逗号分隔。
 		        ->是新引入的语法格式，代表指向动作。
                {}内的语法与传统方法体要求基本一致。
        */

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(1);
        System.out.println("排序前:" + list);

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //升序
                return o1 - o2;
            }
        });

        //Lambda表达式
        Collections.sort(list, (Integer i1, Integer i2) -> {
            //升序
            return i1 - i2;
        });
        System.out.println("排序后:" + list);
    }
}
