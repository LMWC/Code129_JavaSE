package com.homework.work02_继承;

/**
 * 动物
 */
public class Animal {

    private int age; //年龄

    public void move() {
        System.out.println("动物会动...");
    }

    //空参构造、全参构造、getter、setter

    public Animal() {
    }

    public Animal(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
