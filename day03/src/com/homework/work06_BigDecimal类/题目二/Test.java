package com.homework.work06_BigDecimal类.题目二;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student("张三","男",20,79.5);
        Student stu2 = new Student("李四","女",21,80.2);
        Student stu3 = new Student("王五","男",22,77.9);
        Student stu4 = new Student("周六","男",20,55.8);
        Student stu5 = new Student("赵七","女",21,99.9);

        // 定义和变量
        BigDecimal sum = new BigDecimal("0");

        sum = sum.add(new BigDecimal(stu1.getScore() + ""));
        sum = sum.add(new BigDecimal(stu2.getScore() + ""));
        sum = sum.add(new BigDecimal(stu3.getScore() + ""));
        sum = sum.add(new BigDecimal(stu4.getScore() + ""));
        sum = sum.add(new BigDecimal(stu5.getScore() + ""));

        // 求平均分,四舍五入保留2位小数
        BigDecimal avg = sum.divide(new BigDecimal("5"), 2, RoundingMode.HALF_UP);

        System.out.println("平均分:"+avg);
    }
}
