package com.itheima.demo3_等待唤醒机制;

/**
 * @author jialefei
 * @date 2022/4/26 8:55
 */
public class Test {
    public static void main(String[] args) {
        //锁对象 wait方法会让线程处于锁阻塞(等待)状态
        //notify方法，用于将由于wait方法处于等待状态的线程唤醒

        //实现等待唤醒机制，需要包子wait和notify方法用的是同一个锁对象

        //案例设计说明
        //notify 唤醒的时候，唤醒拥有同意把锁的某个处于wait状态的现象
        //所以我们要通过判断的逻辑，控制唤醒指定的线程执行。

        //创建AB线程并启动
        new MyThreadA().start();
        new MyThreadB().start();
    }
}
