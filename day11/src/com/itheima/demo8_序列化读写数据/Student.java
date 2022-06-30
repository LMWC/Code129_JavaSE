package com.itheima.demo8_序列化读写数据;

import java.io.Serializable;

public class Student implements Serializable {
    String name;
    int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
