package com.itheima.demo5_同步代码块解决线程安全问题;

/**
 * @author jialefei
 * @date 2022/4/25 8:52
 */
public class Test {
    //需求:假设有100张电影票，需要从4个窗口同时出售这100张票，用线程模拟该场景
    public static void main(String[] args) {
        /*格式:
        synchronized(同步锁对象){
                //锁对象可以是任意类型对象
                //多个线程要达到同步效果，需要保证使用的是同一把锁
            需要同步的操作
        }*/

        //创建任务对象
        TicketRunnable r = new TicketRunnable();
        //创建线程对象并启动
        new Thread(r, "窗口1:").start();
        new Thread(r, "窗口2:").start();
        new Thread(r, "窗口3:").start();
        new Thread(r, "窗口4:").start();
    }
}
