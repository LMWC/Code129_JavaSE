package com.homework.work02_接口;

public class Test {
    public static void main(String[] args) {
        //汽车
        BenzCar benzCar = new BenzCar(220);
        benzCar.run();
        System.out.println("--------------------");
        BMWCar bmwCar = new BMWCar(230);
        bmwCar.run();
        bmwCar.positioning();
        System.out.println("--------------------");
        //摩托车
        YamahaMoto yamahaMoto = new YamahaMoto(120);
        yamahaMoto.run();
        System.out.println("--------------------");
        BMWMoto bmwMoto = new BMWMoto(125);
        bmwMoto.run();
        bmwCar.positioning();
    }
}
