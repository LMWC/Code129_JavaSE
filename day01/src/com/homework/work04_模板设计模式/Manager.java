package com.homework.work04_模板设计模式;

/**
 * 经理 继承成员
 */
public class Manager extends Member {

    private double bonus;

    @Override
    public void setContent(String content) {
        System.out.println(content);
    }

    //空参构造、全参构造、getter、setter

    public Manager(String jobId, String name, int age, double bonus) {
        super(jobId, name, age);
        this.bonus = bonus;
    }

    public Manager() {
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}