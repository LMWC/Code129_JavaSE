package com.itheima.demo2_无限等待;

/**
 * @author jialefei
 * @date 2022/4/26 8:47
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("开始");
        Object lock = new Object();
        //注意:wait必须有锁对象来调用
        //无限等待
        synchronized (lock) {
            lock.wait();
        }
        System.out.println("结束");
    }
}
