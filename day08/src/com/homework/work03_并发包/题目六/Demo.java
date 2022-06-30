package com.homework.work03_并发包.题目六;

import java.util.Date;
import java.util.concurrent.Semaphore;

public class Demo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);

        for (int i = 0; i < 10; i++) {
            new Thread(){
                @Override
                public void run() {
                    try {
                        // 获得参观权
                        semaphore.acquire();
                        System.out.println(Thread.currentThread().getName()+"开始参观"+new Date());
                        // 参观 2s
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        // 释放参观权
                        semaphore.release();
                    }
                }
            }.start();
        }
    }
}
