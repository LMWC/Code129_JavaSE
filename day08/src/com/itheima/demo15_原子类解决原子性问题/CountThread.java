package com.itheima.demo15_原子类解决原子性问题;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author jialefei
 * @date 2022/4/25 10:43
 */
public class CountThread extends Thread {
    AtomicInteger count = new AtomicInteger();//默认就是0

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            count.incrementAndGet();
        }
    }
}
