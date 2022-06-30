package com.itheima.demo7_lambda省略格式;

/**
 * @author jialefei
 * @date 2022/4/26 10:34
 */
public class Test {
    public static void main(String[] args) {
        //小括号内参数的类型可以省略；
        method1((a, b) -> {
            System.out.println(a + b);
        });
        //如果小括号内有且仅有一个参数，则小括号和参数类型可以一起省略；
        method2(a -> {
            System.out.println(a);
        });
        //大括号内有且仅有一个语句，则可以同时省略((一对大括号+语句后的分号))；
        method3(a ->
                System.out.println(a)
        );
        //如果大括号内仅有的一个语句是return语句，则return也可以省略。
        method4(a ->
                a + 10
        );
    }

    public static void method1(MyInter1 m) {
        m.run(10, 20);
    }

    public static void method2(MyInter2 m) {
        m.run(10);
    }

    public static void method3(MyInter3 m) {
        m.run(10);
    }

    public static void method4(MyInter4 m) {
        int num = m.run(10);
        System.out.println(num);
    }

}
