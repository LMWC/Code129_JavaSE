package com.itheima.demo16_数组多线程原子性问题;

import java.util.Arrays;

/**
 * @author jialefei
 * @date 2022/4/25 11:04
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        //创建集合对象并启动  1000次
        for (int i = 0; i < 1000; i++) {
            new ArrayThread().start();
        }

        //睡一会，确保子线程全部执行完成
        Thread.sleep(1000);

        //打印结果
        //期望结果:每个元素都是1000
        System.out.println(Arrays.toString(ArrayThread.arr));
    }
}
