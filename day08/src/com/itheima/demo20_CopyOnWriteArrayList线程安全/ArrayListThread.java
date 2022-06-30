package com.itheima.demo20_CopyOnWriteArrayList线程安全;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author jialefei
 * @date 2022/4/25 14:44
 */
public class ArrayListThread  extends Thread{
    CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
    }
}
