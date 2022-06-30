package com.itheima.demo16_数组多线程原子性问题;

/**
 * @author jialefei
 * @date 2022/4/25 11:02
 */
public class ArrayThread extends Thread {
    static int[] arr = new int[1000];

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            //让每一个位置递增1
            arr[i]++;
        }
    }
}
