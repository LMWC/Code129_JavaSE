package com.itheima02_代码块;

public class Person {
    public  final int NUM;
    static {
        System.out.println("Person静态代码块");
    }

    {
        System.out.println("Person构造代码块");
        //所有的构造方法执行的时候都要干的事情，就可以放到构造代码块里执行。
        NUM=10;
    }

    public Person(){
        System.out.println("Person的无参构造");
        //NUM=10;
    }

    public Person( int num){
        System.out.println("Person的有参构造");
        //NUM=10;
    }
}
