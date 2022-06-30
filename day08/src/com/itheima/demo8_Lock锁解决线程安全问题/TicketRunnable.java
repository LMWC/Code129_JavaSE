package com.itheima.demo8_Lock锁解决线程安全问题;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author jialefei
 * @date 2022/4/25 8:54
 */
public class TicketRunnable implements Runnable {
    int ticket = 100;
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        //加循环，重复卖票
        while (true) {
            //排队，等一会
            //try {
            //    Thread.sleep(1000);
            //} catch (InterruptedException e) {
            //    e.printStackTrace();
            //}

            //加锁
            lock.lock();
            //判断，如果有票，才卖票
            if (ticket > 0) {
                //执行卖票的操作
                System.out.println(Thread.currentThread().getName() + "正在卖出第" + ticket + "张票");
                //票数减少1张
                ticket--;
            }
            //如果想让程序完成后彻底结束，这里要结束循环
            //else {
            //    break;
            //}
            //解锁
            lock.unlock();
        }
    }
}
