package com.itheima.demo24_Hashtable线程安全;

import java.util.Hashtable;

/**
 * @author jialefei
 * @date 2022/4/25 14:44
 */
public class HashMapThread extends Thread{
    Hashtable<Integer,Integer> map = new Hashtable<>();

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            map.put(i,i);
        }
    }
}
