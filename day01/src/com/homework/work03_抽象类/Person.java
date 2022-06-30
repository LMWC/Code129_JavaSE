package com.homework.work03_抽象类;

/**
 * 人员类
 */
public abstract class Person {

    private String id; //编号
    private String name; //性别
    private String gender; //性别
    private int age; //年龄


    //空参构造
    public Person() {
    }

    //全参构造
    public Person(String id, String name, String gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    //吃饭（抽象方法）
    public abstract void eat();

    //getter、setter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
