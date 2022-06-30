package com.itheima.demo6_同步方法解决线程安全问题;

/**
 * @author jialefei
 * @date 2022/4/25 8:52
 */
public class Test {
    //需求:假设有100张电影票，需要从4个窗口同时出售这100张票，用线程模拟该场景
    public static void main(String[] args) {
        /*
        同步方法格式:
            public synchroized [static] 返回值类型 方法名(形参列表){
	        需要同步的操作
            }
         */

        //创建任务对象
        TicketRunnable r = new TicketRunnable();
        //创建线程对象并启动
        new Thread(r,"窗口1:").start();
        new Thread(r,"窗口2:").start();
        new Thread(r,"窗口3:").start();
        new Thread(r,"窗口4:").start();
    }
}
