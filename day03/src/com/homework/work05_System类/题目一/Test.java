package com.homework.work05_System类.题目一;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //创建数组
        int[] arr = {10, 27, 8, 5, 2, 1, 3, 55, 88};

        //定义新数组
        int[] arrNew = new int[5];

        //拷贝元素
        System.arraycopy(arr, 2, arrNew, 0, 5);

        //打印结果
        System.out.println(Arrays.toString(arrNew));
    }
}
