package com.homework.work03_并发包.题目三;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
//        Map<Integer,Integer> map = new ConcurrentHashMap<>(); // 没有 HashMap 的问题
        Map<Integer,Integer> map = new HashMap<>(); // 有可能出现最后个数不足 20000
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 10000; i++) {
                    map.put(i, i);
                }
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 10001; i <= 20000; i++) {
                    map.put(i, i);
                }
            }
        };
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(map.size());// 正确结果应当是 20000
    }
}
