package com.homework.work03_并发包.题目一;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
//        List<Integer> list = new CopyOnWriteArrayList<>(); // 没有 ArrayList 的问题
        List<Integer> list = new ArrayList<>(); // 有可能出现空指针、下标越界等错误
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 10000; i++) {
                    list.add(i);
                }
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 10001; i <= 20000; i++) {
                    list.add(i);
                }
            }
        };
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(list.size());// 正确结果应当是 20000
    }
}
