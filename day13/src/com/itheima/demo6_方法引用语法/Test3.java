package com.itheima.demo6_方法引用语法;

import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {
        Stream<Car> cars = Stream.of(new Car(), new Car());
        //void accept(T t);
        //cars.forEach(
        //        (Car car) -> {
        //            System.out.println(car);
        //        }
        //);
        //非静态无参方法特殊引用方式
        cars.forEach(Car::show);
    }
}
