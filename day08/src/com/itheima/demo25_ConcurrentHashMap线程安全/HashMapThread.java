package com.itheima.demo25_ConcurrentHashMap线程安全;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author jialefei
 * @date 2022/4/25 14:44
 */
public class HashMapThread extends Thread{
   ConcurrentHashMap<Integer,Integer> map = new ConcurrentHashMap<>();

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            map.put(i,i);
        }
    }
}
