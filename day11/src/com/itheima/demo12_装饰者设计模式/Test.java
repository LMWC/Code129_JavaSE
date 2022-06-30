package com.itheima.demo12_装饰者设计模式;

public class Test {
    public static void main(String[] args) {
        //a. 编写一个Star接口, 提供sing 和 dance抽象方法
        //b. 编写一个LiuDeHua类,实现Star接口,重写抽象方法
        //c. 在不修改LiuDeHua类的原则上，利用装饰者模式对LiuDeHua类的sing方法进行扩展。

        LiuDeHua ldh = new LiuDeHua();
        LiuDeHuaWapper lsdw = new LiuDeHuaWapper(ldh);
        lsdw.sing();
        System.out.println("--------");
        lsdw.dance();
    }
}
