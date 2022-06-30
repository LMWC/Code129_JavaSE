package com.homework.work06_BigDecimal类.题目一;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test {
    public static void main(String[] args) {
        // 声明数组
        double[] arr = {0.1,0.2,2.1,3.2,5.56,7.21};

        // 定义和变量
        BigDecimal sum = new BigDecimal("0");

        // 求和
        for (int i = 0; i < arr.length; i++) {
            // 累加  为了避免精度问题,需要把数字变成字符串
            sum = sum.add(new BigDecimal(arr[i]+""));
        }

        // 计算平均值
        BigDecimal avg = sum.divide(new BigDecimal(arr.length), 2, RoundingMode.HALF_UP);

        System.out.println("总和:"+sum);// 总和:18.37
        System.out.println("平均值:"+avg);// 平均值:3.06
    }
}
