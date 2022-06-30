package com.itheima.demo23_HashMap线程不安全;

import java.util.HashMap;

/**
 * @author jialefei
 * @date 2022/4/25 14:44
 */
public class HashMapThread extends Thread{
    HashMap<Integer,Integer> map = new HashMap<>();

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            map.put(i,i);
        }
    }
}
