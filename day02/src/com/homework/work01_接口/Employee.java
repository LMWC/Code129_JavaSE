package com.homework.work01_接口;

/**
 * 员工
 */
public abstract class Employee {

    //成员变量
    private String name; //姓名
    private String gender; //性别
    private String age; //年龄

    //空参构造
    public Employee() {
    }

    //全参构造
    public Employee(String name, String gender, String age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    //成员方法
    public abstract void work();

    //getter & setter

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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
