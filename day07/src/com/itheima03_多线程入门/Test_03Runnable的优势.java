package com.itheima03_多线程入门;

public class Test_03Runnable的优势 {
    public static void main(String[] args) {
        //Thread子类不能达到数据共享的效果
        /*MyThread2 mt = new MyThread2();
        mt.num=100;
        System.out.println(mt.num);
        MyThread2 mt2 = new MyThread2();
        mt2.num=100;
        System.out.println(mt2.num);*/

        //Runnable实现类对象容易达到数据共享效果
        MyRunnable2 mr = new MyRunnable2();
        Thread t1 = new Thread(mr);
        t1.start();
        Thread t2 = new Thread(mr);
        t2.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(mr.num);
    }
}
