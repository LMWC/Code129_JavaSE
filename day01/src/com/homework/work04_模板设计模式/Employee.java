package com.homework.work04_模板设计模式;

/**
 * 员工 继承成员
 */
public class Employee extends Member {

    @Override
    public void setContent(String content) {
        System.out.println(content);
    }

    //空参构造、全参构造、getter、setter

    public Employee(String jobId, String name, int age) {
        super(jobId, name, age);
    }

    public Employee() {
    }
}
