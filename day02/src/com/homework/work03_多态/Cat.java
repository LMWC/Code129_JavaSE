package com.homework.work03_多态;

/**
 * 猫 继承 动物类
 */
public class Cat extends Animal {

    @Override
    public void eat(){
        System.out.println("猫吃鱼...");
    }

    //特有的方法
    public void catchMouse() {
        System.out.println("抓老鼠...");
    }

    public Cat() {
    }

    public Cat(String name, int age, String gender) {
        super(name, age, gender);
    }
}
