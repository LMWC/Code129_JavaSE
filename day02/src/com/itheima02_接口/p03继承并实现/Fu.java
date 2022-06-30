package com.itheima02_接口.p03继承并实现;

public abstract class Fu {
    public static final int NUM = 10;

    public abstract void abstractMethod();


    //成员方法
    public  void defaultMethod() {
        System.out.println("我是父类中的一个成员方法");
    }

    //静态方法
    public static void staticMethod() {
        System.out.println("我是父类中的一个静态方法");
    }
}
