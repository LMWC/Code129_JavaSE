package com.homework.work02_继承;

/**
 * 鸟类
 */
public class Bird extends Animal {

    //重写父类的方法
    @Override
    public void move() {
        System.out.println("鸟在天上飞...");
    }

    //空参构造、全参构造、getter、setter

    public Bird() {
    }

    public Bird(int age) {
        super(age);
    }
}
