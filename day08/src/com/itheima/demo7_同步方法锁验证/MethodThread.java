package com.itheima.demo7_同步方法锁验证;

/**
 * @author jialefei
 * @date 2022/4/25 9:42
 */
public class MethodThread extends Thread {
    @Override
    public void run() {
        drive();
    }

    //锁:this
    public synchronized void drive()  {
        System.out.println("子线程:开门");
        System.out.println("子线程:打火");
        System.out.println("子线程:驾驶");
        System.out.println("子线程:熄火");
        System.out.println("子线程:停车");
    }
}
