package com.itheima.demo19_ArrayList线程不安全;

import java.util.ArrayList;

/**
 * @author jialefei
 * @date 2022/4/25 14:44
 */
public class ArrayListThread  extends Thread{
    ArrayList<Integer> list = new ArrayList<>();

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
    }
}
