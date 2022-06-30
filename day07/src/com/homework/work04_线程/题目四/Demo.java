package com.homework.work04_线程.题目四;

public class Demo {
    public static void main(String[] args) {
        new H14ThreadSum100().start();
        new H14ThreadSum1000().start();
    }
}

class H14ThreadSum100 extends Thread {
    @Override
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(Thread.currentThread().getName() + "线程计算1--100的累加和，结果：" + sum);
    }
}

class H14ThreadSum1000 extends Thread {
    @Override
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            sum += i;
        }
        System.out.println(Thread.currentThread().getName() + "线程计算1--1000的累加和，结果：" + sum);
    }
}
