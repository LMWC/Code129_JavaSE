package com.itheima.demo5_lambda体验;

/**
 * @author jialefei
 * @date 2022/4/26 10:02
 */
public class Test {
    public static void main(String[] args) {
        //需求：使用实现接口的形式创建并启动线程对象

        //1.创建接口的实现类
        MyRunnable r = new MyRunnable();
        new Thread(r).start();

        //2.匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类的形式实现");
            }
        }).start();

        //3,lambda形式 面向过程思想
        new Thread(() -> {
            System.out.println("Lambda的形式实现");
        }).start();

    }
}
