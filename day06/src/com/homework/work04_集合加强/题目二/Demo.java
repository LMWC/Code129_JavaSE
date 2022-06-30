package com.homework.work04_集合加强.题目二;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        // 定义一个集合,用来存储一注双色球号码,限制集合中元素类型为Integer类型
        ArrayList<Integer> list = new ArrayList<>();

        // 创建Random对象
        Random r = new Random();

        // 产生6个1-33的红球号码,并存储到集合中,要求不重复
        for (int i = 0; i < 6; i++) {
            // 随机产生一个红球号码
            int redNum = r.nextInt(33)+1;
            // 判断集合中是否存在了该红球号码
            if (list.contains(redNum)){
                System.out.println("索引为:"+i+"的时候,产生了重复号码:"+redNum);
                i--;
            }else{
                list.add(redNum);
            }
        }

        // 对6个红球号码排序
        Collections.sort(list);

        // 产生1个1-16的蓝球号码
        int blueNum = r.nextInt(16)+1;

        // 把蓝球号码添加到集合中
        list.add(blueNum);

        //打印
        System.out.println(list);
    }
}
