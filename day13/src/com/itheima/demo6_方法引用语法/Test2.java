package com.itheima.demo6_方法引用语法;

import com.itheima.demo5_方法引用体验.Test;

import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        //静态方法引用：Class::方法名   方法的参数与lambda重写的方法参数(类型和数量)保持一致。
        //非静态方法引用：对象::方法名    方法的参数与lambda重写的方法参数(类型和数量)保持一致。

        //Stream<Car> cars = Stream.of(new Car(), new Car());
        ////void accept(T t);
        //cars.forEach(
        //        (Car car) -> {
        //            System.out.println(car);
        //        }
        //);

        //方法引用
        Stream<Car> cars = Stream.of(new Car(), new Car());
        cars.forEach(Test2::show1);

        Stream<Car> cars2 = Stream.of(new Car(), new Car());
        Test2 t = new Test2();
        cars2.forEach(t::show2);
    }

    public static void show1(Car car) {
        System.out.println(car);
    }

    public void show2(Car car) {
        System.out.println(car);
    }
}
