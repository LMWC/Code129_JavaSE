package com.homework.work07_Arrays类.题目一;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //声明数组
        int[] arr = {1, 332, 43, 25, 3324, 34, 335, 4, 45, 2, 43, 52, 54};

        //打印数组所有元素
        System.out.println(Arrays.toString(arr));

        //升序排序
        Arrays.sort(arr);

        //再次打印
        System.out.println(Arrays.toString(arr));
    }
}
