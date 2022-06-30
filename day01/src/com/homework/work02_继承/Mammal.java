package com.homework.work02_继承;

/**
 * 哺乳类  继承动物类
 */
public class Mammal extends Animal {

    //重写父类的方法
    @Override
    public void move() {
        System.out.println("哺乳动物拥有快速运动的能力...");
    }

    //自己特有的方法
    public void nervousSystem() {
        System.out.println("哺乳动物拥有发达的神经系统...");
    }

    //空参构造、全参构造、getter、setter

    public Mammal() {
    }

    public Mammal(int age) {
        super(age);
    }
}
