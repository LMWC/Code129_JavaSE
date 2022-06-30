package com.homework.完成工厂设计模式代码;

public class CarFactoryTest {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car bmw = carFactory.createCar("bmw");
        bmw.run();
        Car benz = carFactory.createCar("benz");
        benz.run();
    }
}
