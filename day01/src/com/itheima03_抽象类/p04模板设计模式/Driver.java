package com.itheima03_抽象类.p04模板设计模式;

public abstract class Driver {
    public void open() {
        System.out.println("开门");
    }

    public void fire() {
        System.out.println("打火");
    }

    public abstract void zishi();

    public void stop() {
        System.out.println("停车");
    }

    public void close() {
        System.out.println("熄火");
    }

    public void drive(){
        open();
        fire();
        //1.当前类是抽象类，不能创建对象
        //2.将来一定是创建子类对象，子类对象必须重写抽象方法
        zishi();
        stop();
        close();
    }
}
