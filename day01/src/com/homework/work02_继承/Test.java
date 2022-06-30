package com.homework.work02_继承;

public class Test {
    public static void main(String[] args) {
        Parrot parrot = new Parrot(1);
        Owl owl = new Owl(2);
        Magpie magpie = new Magpie(3);

        Elephant elephant = new Elephant(4);
        Giraffe giraffe = new Giraffe(5);
        Wolf wolf = new Wolf(6);

        Crocodile crocodile = new Crocodile(7);
        Snake snake = new Snake(8);
        Tortoise tortoise = new Tortoise(9);

        System.out.println("parrot "+parrot.getAge());
        parrot.move();
        System.out.println("owl "+owl.getAge());
        owl.move();
        System.out.println("magpie "+magpie.getAge());
        magpie.move();
        System.out.println("----------");
        System.out.println("elephant "+elephant.getAge());
        elephant.move();
        System.out.println("giraffe "+giraffe.getAge());
        giraffe.move();
        System.out.println("wolf "+wolf.getAge());
        wolf.move();
        System.out.println("----------");
        System.out.println("crocodile "+crocodile.getAge());
        crocodile.move();
        System.out.println("snake "+snake.getAge());
        snake.move();
        System.out.println("tortoise "+tortoise.getAge());
        tortoise.move();
    }
}
