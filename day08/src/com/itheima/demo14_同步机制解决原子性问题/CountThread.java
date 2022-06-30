package com.itheima.demo14_同步机制解决原子性问题;

/**
 * @author jialefei
 * @date 2022/4/25 10:43
 */
public class CountThread extends Thread {
    int count = 0;

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            synchronized (this){
                count++;
            }

        }
    }
}
