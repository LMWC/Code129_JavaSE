package com.itheima.demo28_Semaphore;

import java.util.concurrent.Semaphore;

/**
 * @author jialefei
 * @date 2022/4/25 15:57
 */
public class CuoZaoThread extends Thread {
    private Semaphore s;

    public CuoZaoThread(Semaphore s) {
        this.s = s;
    }

    @Override
    public void run() {
        //等待将搓澡牌交给搓澡师傅
        try {
            s.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //获取了搓澡的机会，搓澡中
        System.out.println(getName()+"搓澡中...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //搓澡师傅忙完了，释放搓澡位置，等待下一个人来搓澡
        s.release();
    }
}
