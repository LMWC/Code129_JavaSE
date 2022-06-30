package com.itheima.demo13_volatile不能解决原子性问题;

/**
 * @author jialefei
 * @date 2022/4/25 10:43
 */
public class CountThread extends Thread {
    volatile int count = 0;

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            count++;
        }
    }
}
