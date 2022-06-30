package com.itheima.demo1_继承Thread创建并启动多个线程;

/**
 * @author jialefei
 * @date 2022/4/25 8:38
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(getName()+"线程要执行的任务");
    }
}
