package com.itheima02_接口.p01接口入门;

public class MyInterImpl implements MyInter {
    //实现类是非抽象类，必须重写抽象方法
    @Override
    public void abstractMethod() {
        System.out.println("实现了重写了接口中的抽象方法");
    }

    //接口中的默认方法，实现类可以重写，也可以不重写。
    @Override
    public  void defaultMethod2() {
        System.out.println("我是实现类重写的默认方法2");
    }

    //静态方法不存在继承关系
    //@Override
    //public static void staticMethod() {
    //    System.out.println("我是一个静态方法");
    //}
}
