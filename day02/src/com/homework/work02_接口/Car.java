package com.homework.work02_接口;

/**
 * 汽车类 继承 机动车类
 */
public class Car extends MotorVehicle {

    //空参构造
    public Car() { }

    //全参构造
    public Car(String brand, int maxSpeed) {
        super(brand, "汽车", maxSpeed);  //确定类型为汽车
    }
}
