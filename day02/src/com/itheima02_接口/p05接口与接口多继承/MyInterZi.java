package com.itheima02_接口.p05接口与接口多继承;

public interface MyInterZi extends MyInterA,MyInterB {

    //因为当前的MyInterZi是一个接口，接口中本类就可以存在，抽象方法。所以不用重写，也可以重写。


    //子接口继承多个父接口，如果有同名的默认方法，必须重写1次
    @Override
    default void defaultMethod() {

    }
}
