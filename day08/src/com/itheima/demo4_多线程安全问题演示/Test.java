package com.itheima.demo4_多线程安全问题演示;

/**
 * @author jialefei
 * @date 2022/4/25 8:52
 */
public class Test {
    //需求:假设有100张电影票，需要从4个窗口同时出售这100张票，用线程模拟该场景
    public static void main(String[] args) {
        //创建任务对象
        TicketRunnable r = new TicketRunnable();
        //创建线程对象并启动
        new Thread(r,"窗口1:").start();
        new Thread(r,"窗口2:").start();
        new Thread(r,"窗口3:").start();
        new Thread(r,"窗口4:").start();
    }
}
