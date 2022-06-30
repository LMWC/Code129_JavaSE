package com.itheima04_final;

//成员变量被final修饰
public class Demo {
    //被final修饰的成员位置的变量。不认默认值的。
    //必须手动赋值。
    //final int NUM =10;
    //创建对象前，我还没想好这个值是多少？
    //需要保证，所有的对象创建之后，这个常量一定有值。
    final int NUM;

    public Demo() {
        NUM = 10;
    }

    public Demo(int num) {
        NUM = num;
    }
}
