package com.homework.work03_抽象类;

/**
 * 运动员  继承人员类
 */
public class Athletes extends Person {

    //特有属性
    private String className; //所在班级名称

    //空参构造
    public Athletes() {

    }

    //全参构造
    public Athletes(String id, String name, String gender, int age, String className) {
        super(id, name, gender, age);
        this.className = className;
    }

    //重写父类中的方法
    @Override
    public void eat() {
        System.out.println("运动员吃营养餐");
    }

    //getter、setter

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
