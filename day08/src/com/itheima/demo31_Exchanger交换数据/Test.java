package com.itheima.demo31_Exchanger交换数据;

import java.util.concurrent.Exchanger;

/**
 * @author jialefei
 * @date 2022/4/25 16:05
 */
public class Test {
    public static void main(String[] args) {
        //public Exchanger() 创建用于线程间交换数据的对象
        /*
        public V exchange(V x, long timeout, TimeUnit unit)
        x - 要交换的对象
        timeout - 等待的最长时间
        unit - timeout参数的时间单位(TimeUnit.SECONDS 秒单位)*/


        //创建Exchanger对象
        Exchanger<String> e = new Exchanger<>();
        //创建男孩线程对象并启动
        new BoyThread(e,"张志义").start();
        new GirlThread(e,"林志玲").start();
    }
}
