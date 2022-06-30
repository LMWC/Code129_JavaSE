package com.homework.work03_等待和唤醒.题目一;

/* 分析:
        *      1.假设flag为1执行线程1,flag为2执行线程2
        *          对于线程1: flag为2,进入无限等待,flag为1,执行循环
        *          对于线程2: flag为1,进入无限等待,flag为2,执行计数+1操作
        *      2.线程1是遍历1--1000的数字,当遍历出来的数字同时被2,3,5,7整除,立即唤醒线程2执行count++
        *      3.线程2是将一个计数器 + 1，之后再唤醒等待的线程。
        */
public class Demo {
    static Object lock = new Object();
    static int count = 0;
    static int flag = 1;

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    synchronized (lock){
                        if (flag == 2){
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                        if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                            System.out.println(i);
                            // 否则就继续执行
                            flag = 2;
                            lock.notify();// 唤醒线程
                        }
                    }
                }
                System.out.println("===执行完毕===");
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                // 被唤醒了就执行一次++
                while (true) {
                    synchronized (lock) {
                        if (flag == 1){
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                        if (flag == 2){
                            count++;//计数+1;
                            flag = 1;
                            lock.notify();
                        }
                        System.out.println("========");
                    }
                }
            }
        }).start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(count);
        System.exit(0);
    }
}
