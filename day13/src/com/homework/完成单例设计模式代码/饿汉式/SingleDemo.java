package com.homework.完成单例设计模式代码.饿汉式;

public class SingleDemo {

    //（1）定义一个私有静态变量，定义该静态变量的时候，创建一个该类的对象赋予该变量
    private static SingleDemo instance = new SingleDemo();

    //（2）把构造器私有化
    private SingleDemo(){

    }

    //（3）提供一个公开的静态方法，把唯一的对象给返回出去
    public static SingleDemo getInstance(){
        return instance;
    }

}
