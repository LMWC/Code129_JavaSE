package com.itheima.demo3_多线程运行机制;

/**
 * @author jialefei
 * @date 2022/4/25 8:47
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "正在执行任务" + i);
        }
    }
}
