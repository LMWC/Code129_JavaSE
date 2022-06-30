package com.homework.work03_并发包.题目七;

import java.util.concurrent.Exchanger;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Exchanger<String> exchanger = new Exchanger<>();

        new Thread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"等待交换...");
                String result = null;
                try {
                    result = exchanger.exchange("一条娱乐新闻");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+result);
            }
        }.start();

        Thread.sleep(1000);

        new Thread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"等待交换...");
                String result = null;
                try {
                    result = exchanger.exchange("一条体育新闻");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+result);
            }
        }.start();
    }
}
