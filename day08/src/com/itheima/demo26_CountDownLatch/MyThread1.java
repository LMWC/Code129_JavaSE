package com.itheima.demo26_CountDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author jialefei
 * @date 2022/4/25 15:18
 */
public class MyThread1 extends Thread {
    private CountDownLatch c ;

    public MyThread1(CountDownLatch c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println("线程1:执行了A操作");

        //等待另一个线程执行B操作
        try {
            c.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //倒数次数达到0次继续向下执行

        System.out.println("线程1:执行了C操作");
    }
}
