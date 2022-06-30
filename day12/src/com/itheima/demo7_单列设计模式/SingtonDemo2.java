package com.itheima.demo7_单列设计模式;

//懒汉式
public class SingtonDemo2 {
    private static SingtonDemo2 one;

    private SingtonDemo2() {
    }

    public static SingtonDemo2 getInstance() {
        //体现了延迟加载的思想
        if (one == null) {
            one = new SingtonDemo2();
        }
        return one;
    }
}
