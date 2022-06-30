package com.homework.work02_接口;

/**
 * 宝马摩托车 继承 摩托车 实现 GPS接口
 */
public class BMWMoto extends Motorcycle implements GPS {

    //构造方法
    public BMWMoto(int speed) {
        super("宝马", speed); //确定品牌
    }

    //重写接口中的方法
    @Override
    public void positioning() {
        System.out.println("使用GPS定位...");
    }
}
