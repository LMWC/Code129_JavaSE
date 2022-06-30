package com.itheima.demo2_实现Runnable创建并启动多个线程;

/**
 * @author jialefei
 * @date 2022/4/25 8:42
 */
public class MyRunnable  implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程要执行的任务");
    }
}
