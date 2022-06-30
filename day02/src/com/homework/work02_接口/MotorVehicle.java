package com.homework.work02_接口;

/**
        * 机动车
        */
public class MotorVehicle {

    private String brand; //品牌

    private String type; //类型

    private int maxSpeed; //最大速度

    //行驶
    public void run() {
        System.out.println(brand + type + "以每小时" + maxSpeed + "公里的速度在狂奔...");
    }

    //空参构造
    public MotorVehicle() { }

    //全参构造
    public MotorVehicle(String brand, String type, int maxSpeed) {
        this.brand = brand;
        this.type = type;
        this.maxSpeed = maxSpeed;
    }

    //getter & setter

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
