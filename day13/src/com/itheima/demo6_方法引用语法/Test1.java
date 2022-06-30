package com.itheima.demo6_方法引用语法;

import java.util.function.Supplier;

public class Test1 {
    //构造器引用：Class<T>::new  没有泛型就不写。

    public static void main(String[] args) {
        create(() -> {
            return new Car();
        });


        create(Car::new);

    }


    //public interface Supplier<T> {
    //    T get();
    //}
    public static Car create(Supplier<Car> supplier) {
        return supplier.get();
    }
}
