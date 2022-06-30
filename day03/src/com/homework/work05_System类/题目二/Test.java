package com.homework.work05_System类.题目二;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //创建数组
        int[] arr = {55, 77, 0, 88, 22, 44, 33};

        //后四个元素前移
        System.arraycopy(arr, arr.length - 4, arr, arr.length - 5, 4);

        //最后一位置为0
        arr[arr.length - 1] = 0;

        //打印结果
        System.out.println(Arrays.toString(arr));
    }
}
