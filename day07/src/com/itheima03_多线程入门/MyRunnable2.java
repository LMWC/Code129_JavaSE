package com.itheima03_多线程入门;

public class MyRunnable2 implements Runnable {
    int num =10;
    @Override
    public void run() {
        num--;
    }
}
