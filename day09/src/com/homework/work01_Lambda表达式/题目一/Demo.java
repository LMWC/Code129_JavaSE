package com.homework.work01_Lambda表达式.题目一;

public class Demo {
    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(i+1);
            }
        }).start();
    }
}
