package com.homework.work02_递归.题目一;

public class H21 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static  int factorial(int n){
        // 设置终止条件
        if(n==1){
            return 1;
        }
        // 递归调用
        return n * factorial(n - 1);
    }
}