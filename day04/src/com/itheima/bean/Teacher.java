package com.itheima.bean;

public class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(String id, String name, String birthday, int age, String sex) {
        super(id, name, birthday, age, sex);
    }

    @Override
    public String descript() {
        return "我是一名老师，我的工作是:讲课";
    }
}
