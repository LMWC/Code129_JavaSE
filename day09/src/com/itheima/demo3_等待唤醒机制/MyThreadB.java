package com.itheima.demo3_等待唤醒机制;

/**
 * @author jialefei
 * @date 2022/4/26 8:59
 */
public class MyThreadB extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Const.lock) {
                //如果flag的值为false,就让当前的线程处于等待状态
                if (!Const.flag) {
                    System.out.println("B线程等待执行");
                    try {
                        Const.lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //如果flag的值为true  或者 将来被别人唤醒
                System.out.println("B线程执行结束");
                //修改flag的值
                Const.flag = false;
                //唤醒另一个线程
                Const.lock.notify();
            }
        }
    }
}
