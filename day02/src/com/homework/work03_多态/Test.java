package com.homework.work03_多态;

public class Test {
    public static void main(String[] args) {
        //测试多态
        Animal animal = new Cat();
        animal.eat(); //可以调用

        //animal.catchMouse(); 无法调用子类中特有的方法
    }
}
