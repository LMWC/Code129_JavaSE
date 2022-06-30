package com.homework.work01_继承;

/**
 * 洗衣机
 */
public class WashingMachine extends ElectricalAppliance {

    private String motorType; //电机类型
    private String washingCapacity; //洗涤容量

    //空参构造
    public WashingMachine() { }

    //全参构造
    public WashingMachine(String brand, String model, String color, double price, String motorType, String washingCapacity) {
        super(brand, model, color, price);
        this.motorType = motorType;
        this.washingCapacity = washingCapacity;
    }

    //getter & setter

    public String getMotorType() {
        return motorType;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    public String getWashingCapacity() {
        return washingCapacity;
    }

    public void setWashingCapacity(String washingCapacity) {
        this.washingCapacity = washingCapacity;
    }
}
