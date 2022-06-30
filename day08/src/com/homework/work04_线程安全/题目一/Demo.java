package com.homework.work04_线程安全.题目一;

import java.util.Date;

public class Demo {
    // 不用 volatile 修饰，子线程看不到 main 线程对该变量的修改
    private static boolean stop = false;

    public static void main(String[] args) throws InterruptedException {
        new Thread() {
            @Override
            public void run() {
                // 注意：while 内不要加任何打印相关代码，否则【不可见】效果出不来
                while (!stop) {
                }
                System.out.println("循环结束，stop 为:" + stop);
            }
        }.start();

        System.out.println(new Date() + "main 线程启动");
        Thread.sleep(1000);
        stop = true;
        System.out.println(new Date() + "main 线程设置 stop 为:" + stop);
    }
}
