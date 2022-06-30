package com.homework.work03_抽象类;

/**
 * 教练员  继承人员类
 */
public class Coach extends Person {

    //空参构造
    public Coach() {
    }

    //全参构造
    public Coach(String id, String name, String gender, int age) {
        super(id, name, gender, age);
    }

    //重写父类中的抽象方法
    @Override
    public void eat() {
        System.out.println("教练员吃工作餐...");
    }


    //getter、setter
}
