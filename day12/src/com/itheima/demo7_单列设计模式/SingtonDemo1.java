package com.itheima.demo7_单列设计模式;

//饿汉式
public class SingtonDemo1 {
    private static final SingtonDemo1 ONE = new SingtonDemo1();
    private SingtonDemo1(){}

    public static SingtonDemo1 getInstance(){
        return ONE;
    }
}
