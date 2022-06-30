package com.homework.work05_匿名内部类的方式实现线程.题目二;

public class Demo {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 1; i <= 100; i++) {
                    sum += i;
                }
                System.out.println(sum);
            }
        }).start();
    }
}
