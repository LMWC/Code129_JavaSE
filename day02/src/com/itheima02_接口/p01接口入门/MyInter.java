package com.itheima02_接口.p01接口入门;

//public  abstract interface MyInter {
public interface MyInter {
    //int num=10;//隐含了public static final
    public static final int NUM = 10;

    //由于jdk7前只有抽象方法，所以可以只写返回值类型和方法名及参数
    //void abstractMethod();//隐含了public abstract
    public abstract void abstractMethod();


    //默认方法，相当于类中的成员方法
    public default void defaultMethod() {// default不能省略
        System.out.println("我是接口中的一个默认方法");
    }
    public default void defaultMethod2() {// default不能省略
        System.out.println("我是接口中的一个默认方法2");
    }
    //静态方法
    public static void staticMethod() {// static不能省略
        System.out.println("我是接口中的一个静态方法");
    }
}
