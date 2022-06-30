package com.itheima.demo3_等待唤醒机制;

/**
 * @author jialefei
 * @date 2022/4/26 8:59
 */
public class MyThreadA extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Const.lock){
                //如果flag的值为true,就让当前的线程处于等待状态
                if (Const.flag){
                    try {
                        System.out.println("A线程等待执行");
                        Const.lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //如果flag值为false  或  将来被别人唤醒

                System.out.println("A线程执行结束");
                //修饰flag的值为true
                Const.flag=true;
                //唤醒另一个线程
                Const.lock.notify();
            }
        }
    }
}
