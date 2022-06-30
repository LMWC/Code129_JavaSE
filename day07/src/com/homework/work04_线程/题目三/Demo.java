package com.homework.work04_线程.题目三;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        new H13Thread().start();
    }
}

class H13Thread extends Thread {
    // 注意 SimpleDateFormat 不是线程安全，现在是一个线程使用它因此没有并发问题
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            // 间隔 1s
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 按格式输出当前时间
            System.out.println(sdf.format(new Date()));
        }
    }
}
