package com.homework.work04_线程.题目二;

public class Demo {
    public static void main(String[] args) {
        // 启动自定义线程
        new Thread(new H12Task()).start();

        // 主线程输出
        for (int k = 0; k < 1000; k++) {
            System.out.println("main:" + k);
        }
    }
}

class H12Task implements Runnable {
    @Override
    public void run() {
        // 自定义线程输出
        for (int i = 0; i < 1000; i++) {
            System.out.println("H12Task:" + i);
        }
    }
}
