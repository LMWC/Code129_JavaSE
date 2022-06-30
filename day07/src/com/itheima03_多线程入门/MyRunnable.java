package com.itheima03_多线程入门;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        //打印100个数字
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
