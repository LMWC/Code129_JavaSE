package com.homework.work02_接口;

/**
 * 宝马汽车 继承 汽车类 实现 GPS接口
 */
public class BMWCar extends Car implements GPS {

    //构造方法
    public BMWCar(int maxSpeed) {
        super("宝马", maxSpeed); //确定品牌
    }

    //重写接口中的方法
    @Override
    public void positioning() {
        System.out.println("使用GPS定位...");
    }
}
