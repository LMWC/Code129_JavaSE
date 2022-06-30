package com.homework.work01_接口;

/**
 * Java 讲师 继承 员工类
 */
public class JavaTeacher extends Employee {

    @Override
    public void work() {
        System.out.println("Java 讲师正在授课...");
    }

    public JavaTeacher() {
    }

    public JavaTeacher(String name, String gender, String age) {
        super(name, gender, age);
    }
}
