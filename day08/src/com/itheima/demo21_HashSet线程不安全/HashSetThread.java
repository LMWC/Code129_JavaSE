package com.itheima.demo21_HashSet线程不安全;

import java.util.HashSet;

/**
 * @author jialefei
 * @date 2022/4/25 14:44
 */
public class HashSetThread extends Thread{
    HashSet<Integer> set = new HashSet<>();

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            set.add(i);
        }
    }
}
