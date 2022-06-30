package com.homework.work04_线程.题目一;

public class Demo {
    public static void main(String[] args) {
        // 启动自定义线程
        new H11Thread().start();

        // 主线程输出
        for (int k = 0; k < 1000; k++) {
            System.out.println("main:"+k);
        }
    }
}

class H11Thread extends Thread{
    @Override
    public void run() {
        // 自定义线程输出
        for (int i = 0; i < 1000; i++) {
            System.out.println("H11Thread:"+i);
        }
    }
}
