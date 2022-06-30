package com.homework.完成单例设计模式代码.懒汉式;

public class SingleDemo {

    //（1）定义一个私有的静态变量，准备之后接收唯一的实例对象
    private static SingleDemo instance;

    //（2）私有化构造器
    private SingleDemo(){

    }

    /*
     （3）定义公开的静态方法，等待需要使用这个对象的时候，先判断是否有唯一对象，
    如果没有则创建一个对象进行返回，如果有则直接返回该对象
     */
    public static SingleDemo getInstance(){
        if(instance==null){//判断是否存在唯一对象
            instance = new SingleDemo();//创建该对象
        }
        return instance;
    }

}
