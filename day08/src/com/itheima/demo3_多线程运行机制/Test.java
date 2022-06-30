package com.itheima.demo3_多线程运行机制;

/**
 * @author jialefei
 * @date 2022/4/25 8:47
 */
public class Test {
    public static void main(String[] args) {
        //多线程运行机制:
                //执行具备随机性，由cpu随机将执行权限分配个程序执行。
                //java中采取的是抢占式运行。
        //为了保证两个线程同时在运行，需要先启动子线程
        MyThread t = new MyThread();
        t.start();


        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "正在执行任务" + i);
        }
    }
}
