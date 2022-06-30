package com.itheima.demo27_CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author jialefei
 * @date 2022/4/25 15:46
 */
public class PeopleThread  extends Thread{
    private CyclicBarrier c;

    public PeopleThread(CyclicBarrier c,String name) {
        super(name);
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(getName()+"到达会议室...");
        try {
            c.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }

        System.out.println(getName()+"发表了一顿意见...");
    }
}
