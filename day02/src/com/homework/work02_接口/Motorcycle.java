package com.homework.work02_接口;

/**
 * 摩托车 继承 机动车
 */
public class Motorcycle extends MotorVehicle {

    //空参构造
    public Motorcycle() { }

    //全参构造
    public Motorcycle(String brand, int maxSpeed) {
        super(brand, "摩托车", maxSpeed);  //确定类型为摩托车
    }
}
