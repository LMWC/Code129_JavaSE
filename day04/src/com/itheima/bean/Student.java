package com.itheima.bean;

public class Student extends Person {
    public Student() {
    }

    public Student(String id, String name, String birthday, int age, String sex) {
        super(id, name, birthday, age, sex);
    }


    public String descript() {
        return "我是一名学生，我的工作是:学习";
    }
}
