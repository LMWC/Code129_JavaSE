package com.itheima.demo5_方法引用体验;

public class Test {
    public static void main(String[] args) {
        //方法引用，替换labmda表达式
        new Thread(() -> {
            System.out.println("哈哈哈");
        }).start();

        //方法引用
        new Thread(Test::show1).start();

        Test t = new Test();
        new Thread(t::show2).start();
    }

    public static void show1() {
        System.out.println("哈哈哈");
    }

    public void show2() {
        System.out.println("哈哈哈");
    }
}
