package com.itheima.demo29_Exchanger阻塞性;

import java.util.concurrent.Exchanger;

/**
 * @author jialefei
 * @date 2022/4/25 16:05
 */
public class Test {
    public static void main(String[] args) {
        //public Exchanger() 创建用于线程间交换数据的对象
        //public V exchange(V x)
        //形参:表示的是交给别的线程的数据
        //返回值:表示的是别的线程返回来的数据

        //创建Exchanger对象
        Exchanger<String> e = new Exchanger<>();
        //创建男孩线程对象并启动
        new BoyThread(e,"张志义").start();
    }
}
