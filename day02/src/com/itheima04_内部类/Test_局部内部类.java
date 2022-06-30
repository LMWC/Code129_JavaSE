package com.itheima04_内部类;

import java.sql.SQLOutput;

public class Test_局部内部类 {

    public static void main(String[] args) {
        int num =10;
        //局部内部类只能在局部使用
        class Inner{
            public void show(){
                System.out.println("一句话");
            }
        }
        Inner in = new Inner();
        in.show();
        System.out.println("--------");

        System.out.println("一句话");
    }

    public static void show(){
        //不能使用main方法中的num变量。
        //不能使用main方法中的Inner类。
        //new Inner();
    }
}
