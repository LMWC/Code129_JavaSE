package com.itheima.demo4_多线程安全问题演示;

/**
 * @author jialefei
 * @date 2022/4/25 8:54
 */
public class TicketRunnable implements Runnable {
    int ticket = 100;

    @Override
    public void run() {
        //加循环，重复卖票
        while (true) {
            //排队，等一会
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //判断，如果有票，才卖票
            if (ticket > 0) {
                //执行卖票的操作
                System.out.println(Thread.currentThread().getName() + "正在卖出第" + ticket + "张票");
                //票数减少1张
                ticket--;
            }
        }
    }
}
