package com.homework.work01_继承;

public class Test {
    public static void main(String[] args) {
        Refrigerator refrigerator = new Refrigerator("1","1","1",1.00,"1","1");
        Television television = new Television("2","2","2",2.00,"2","2");
        WashingMachine washingMachine = new WashingMachine("3","3","3",3.00,"3","3");
        System.out.println(refrigerator.getBrand()+" "+refrigerator.getDoorStyle());
        System.out.println("----------");
        System.out.println(television.getBrand()+" "+television.getResolutionRatio());
        System.out.println("----------");
        System.out.println(washingMachine.getBrand()+" "+washingMachine.getMotorType());
    }
}
