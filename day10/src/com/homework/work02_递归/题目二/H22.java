package com.homework.work02_递归.题目二;

public class H22 {
    public static void main(String[] args) {
        System.out.println(sum(100));
    }

    public static int sum(int n) {
        // 设置终止条件
        if (n == 1) {
            return 1;
        }
        // 递归调用
        return n + sum(n - 1);
    }
}
