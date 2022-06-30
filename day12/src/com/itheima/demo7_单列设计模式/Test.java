package com.itheima.demo7_单列设计模式;

public class Test {
    public static void main(String[] args) {
        SingtonDemo1 a = SingtonDemo1.getInstance();
        SingtonDemo1 b = SingtonDemo1.getInstance();
        System.out.println(a==b);


        SingtonDemo2 a2 = SingtonDemo2.getInstance();
        SingtonDemo2 b2 = SingtonDemo2.getInstance();
        System.out.println(a2==b2);
    }
}
