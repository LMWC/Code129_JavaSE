package com.homework.work02_继承;

/**
 * 爬行类  继承动物类
 */
public class Reptile extends Animal {

    //重写父类的方法
    @Override
    public void move() {
        System.out.println("爬行动物都在地表爬行...");
    }

    //自己特有的方法
    public void ectotherm() {
        System.out.println("爬行动物没有体温调节能力...");
    }

    //空参构造、全参构造、getter、setter

    public Reptile() {
    }

    public Reptile(int age) {
        super(age);
    }
}
