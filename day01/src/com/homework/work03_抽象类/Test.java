package com.homework.work03_抽象类;

public class Test {
    public static void main(String[] args) {
        Coach coach = new Coach("1","1","1",1);
        Athletes athletes = new Athletes("2","2","2",2,"2");

        System.out.println(coach.getId()+" "+coach.getName());
        coach.eat();
        System.out.println("----------");
        System.out.println(athletes.getId()+" "+athletes.getName());
        athletes.eat();
    }
}
