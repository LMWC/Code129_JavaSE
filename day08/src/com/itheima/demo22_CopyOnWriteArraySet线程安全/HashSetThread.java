package com.itheima.demo22_CopyOnWriteArraySet线程安全;

import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author jialefei
 * @date 2022/4/25 14:44
 */
public class HashSetThread extends Thread{
    CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            set.add(i);
        }
    }
}
