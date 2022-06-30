package com.itheima02_接口.p05接口与接口多继承;

//public  abstract interface MyInter {
public interface MyInterB {
    public static final int NUM = 999;

    public abstract void abstractMethod();


    //默认方法
    public default void defaultMethod() {
        System.out.println("我是接口中的一个默认方法B");
    }

    //静态方法
    public static void staticMethod() {
        System.out.println("我是接口中的一个静态方法B");
    }
}
