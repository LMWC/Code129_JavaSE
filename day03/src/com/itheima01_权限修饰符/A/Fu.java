package com.itheima01_权限修饰符.A;

public class Fu {
    private int priNum = 10;
    int num = 20;
    protected int proNum = 30;
    public int pubNum = 40;

    public void show() {
        System.out.println("本类的私有的变量priNum:" + priNum);
        System.out.println("本类的默认的变量num:" + num);
        System.out.println("本类的受保护的变量proNum:" + proNum);
        System.out.println("本类的公共的变量pubNum:" + pubNum);
    }
}
