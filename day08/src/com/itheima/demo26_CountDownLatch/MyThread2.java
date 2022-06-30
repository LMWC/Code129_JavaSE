package com.itheima.demo26_CountDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author jialefei
 * @date 2022/4/25 15:24
 */
public class MyThread2  extends Thread{
    private CountDownLatch c;

    public MyThread2(CountDownLatch c) {
        this.c = c;
    }

    @Override
    public void run() {
        //3秒中以后，再执行线程2的B操作
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程2:执行了B操作");
        c.countDown();
    }
}
