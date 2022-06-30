package com.homework.work01_排序查找算法.题目一;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        //定义以下数组：
        int[] arr = {1,2,432,32,54,32,3,7,657,563,25,43,6,463,52};
        //用Arrays类打印此数组的所有元素；
        System.out.println(Arrays.toString(arr));

        //用“冒泡排序”对数组元素“升序”排序；打印排序后的数组。
        bubbleSort(arr);
        System.out.println("冒泡排升序:"+ Arrays.toString(arr));

        //用“选择排序”对数组元素“降序”排序；打印排序后的数组。
        selectSort(arr);
        System.out.println("选择排降序:"+Arrays.toString(arr));
    }

    //冒泡
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++) {
            for(int j=0;j<arr.length-i-1;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //选择排序
    public static void selectSort(int[] arr){
        for(int i=0;i<arr.length-1;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]<arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
