package com.itheima.demo26_CountDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author jialefei
 * @date 2022/4/25 15:16
 */
public class Test {
    public static void main(String[] args) {
        //public CountDownLatch(int count)：初始化一个指定计数器的CountDownLatch对象

        //public void await()  等待到数到0的时候，当前线程继续执行
        //public void countDown()： 让count递减，当递减到0的时候，处于await状态的代码继续向下执行。


        //创建CountDownLatch对象
        CountDownLatch c = new CountDownLatch(1);
        //创建线程对象并启动
        new MyThread1(c).start();
        new MyThread2(c).start();

    }
}
