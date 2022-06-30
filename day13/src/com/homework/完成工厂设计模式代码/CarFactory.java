package com.homework.完成工厂设计模式代码;

public class CarFactory {
    /**
     * @param id : 车的标识
     *           bmw: 代表需要创建Bmw类对象
     *           benz : 代表需要创建Benz类对象
     *           如果传入的车标识不正确,代表当前工厂生成不了当前车对象,则返回null
     * @return
     */
    public Car createCar(String id){
        if("bmw".equals(id)){
            return new Bmw();
        }else if("benz".equals(id)){
            return new Benz();
        }
        return null;
    }
}
