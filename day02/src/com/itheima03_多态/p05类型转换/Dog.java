package com.itheima03_多态.p05类型转换;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    //看家
    public void lookHouse() {
        System.out.println("狗看家护院");
    }
}
