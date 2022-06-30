package com.homework.work02_增强for;

import java.util.ArrayList;
import java.util.Collection;

public class Demo {
    public static void main(String[] args) {
        //1.使用多态创建Collection集合
        Collection<Double> col = new ArrayList<>();
        //2.添加元素
        col.add(88.5);
        col.add(39.2);
        col.add(77.1);
        col.add(56.8);
        col.add(89.0);
        col.add(99.0);
        col.add(59.5);

        //    	使用增强for遍历所有元素，并打印
        System.out.println("————————————————————使用增强for遍历所有元素，并打印——————————————————————");
        for (Double score : col) {
            System.out.println(score);
        }

        //    	使用增强for遍历所有元素，打印不及格的分数；
        System.out.println("————————————————————使用增强for遍历所有元素，打印不及格的分数——————————————————————");
        for (Double score : col) {
            if(score<60) {
                System.out.println(score);
            }
        }

        //    	使用增强for遍历所有元素，计算不及格的分数的数量，和平均分，并打印计算结果。
        //定义变量用于统计不及格分数的数量
        System.out.println("————————————————————用增强for遍历所有元素，计算不及格的分数的数量，和平均分，并打印计算结果——————————————————————");
        int failNum = 0;
        //定义变量用于统计不及格分数的总分，
        double failSum = 0;
        for (Double score : col) {
            if(score<60) {
                //统计人数与总分
                failNum++;
                failSum+=score;
            }
        }
        //不及格的平均分=不及格总分/不及格数量
        double failAvg = failSum/failNum;
        System.out.println("不及格的平均分："+failAvg);

        //    	使用增强for遍历所有元素，求出最高分，并打印；
        System.out.println("————————————————————使用增强for遍历所有元素，求出最高分，并打印——————————————————————");
        //定义变量记录最高分
        double max = 0;
        for (Double score : col) {
            if(score>max) { //每次取出的分数如果比max大，就赋值给它
                max = score;
            }
        }
        System.out.println("最高分:"+max);
    }
}
