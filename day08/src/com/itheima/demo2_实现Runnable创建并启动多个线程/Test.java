package com.itheima.demo2_实现Runnable创建并启动多个线程;

/**
 * @author jialefei
 * @date 2022/4/25 8:43
 */
public class Test {
    public static void main(String[] args) {
        //创建任务对象
        MyRunnable mr = new MyRunnable();

        //下面的10个线程共享同一个任务对象(资源)

        //用默认名称方式创建并启动线程
        new Thread(mr).start();
        new Thread(mr).start();
        new Thread(mr).start();
        new Thread(mr).start();
        new Thread(mr).start();

        //用指定名称创建并启动线程
        new Thread(mr, "线程1:").start();
        new Thread(mr, "线程2:").start();
        new Thread(mr, "线程3:").start();
        new Thread(mr, "线程4:").start();
        new Thread(mr, "线程5:").start();
    }
}
