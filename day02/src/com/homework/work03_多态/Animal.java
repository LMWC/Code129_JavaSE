package com.homework.work03_多态;

/**
 * 动物
 */
public class Animal {
    //成员变量
    private String name;    //名称
    private int age;        //年龄
    private String gender;  //性别

    //空参构造
    public Animal() {
    }

    //全参构造
    public Animal(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //成员方法
    public void eat() {
        System.out.println("吃东西...");
    }

    //getter & setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
