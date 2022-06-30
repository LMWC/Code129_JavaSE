package com.itheima02_Extends.p03访问规则;

public class Fu {
    int fuNum = 10;
    int num = 666;

    public Fu() {
        System.out.println("父类的无参构造方法");
    }

    private int money = 999;

    public int getMoney() {
        System.out.println("你敢把钱花完，我就打死你");
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void fuMethod() {
        System.out.println("父类中的fuMethod方法");
    }

    public void method() {
        System.out.println("父类中的method方法");
    }


    public void show() {
        System.out.println("父类中的show方法");
        System.out.println("一个月赚一万块");
    }
}
