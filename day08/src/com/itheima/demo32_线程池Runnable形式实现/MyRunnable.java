package com.itheima.demo32_线程池Runnable形式实现;

/**
 * @author jialefei
 * @date 2022/4/25 16:29
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("使用Runnable提交任务");
    }
}
