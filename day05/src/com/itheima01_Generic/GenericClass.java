package com.itheima01_Generic;

public class GenericClass<BYD> {
    //泛型作为形参
    public void method1(BYD byd) {
        System.out.println(byd);
    }

    //泛型作为返回值类型
    public BYD method2() {
        //将来的泛型必须是String类型，否则会出现错误的类型转换，产生异常。
        BYD byd = (BYD) "abc";
        return byd;
    }
}
