package com.itheima.demo1_继承Thread创建并启动多个线程;

/**
 * @author jialefei
 * @date 2022/4/25 8:38
 */
public class Test {
    public static void main(String[] args) {
        //创建线程并启动
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
    }
}
