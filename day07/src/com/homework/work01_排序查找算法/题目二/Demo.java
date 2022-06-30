package com.homework.work01_排序查找算法.题目二;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        //请定义main()方法，在main()中定义以下数组：
        int[] arr = {431,54,25,25,26,45,2,4,65,3,64,6,46,7,54};

        //使用冒泡排序对元素进行排序；
        bubbleSort(arr);
        System.out.println("冒泡排序后:"+ Arrays.toString(arr));

        //排序后，使用二分法查找元素：2，并打印查询结果；
        int index = binSearch(arr, 2);
        System.out.println("元素2所在数组的下标为："+index);

        //再使用二分法查找200，并打印查找结果；
        int index2 = binSearch(arr, 200);
        System.out.println("元素200所在数组的下标为："+index2);//-1即找不到

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

    //二分搜索,返回值为-1即找不到
    public static int binSearch(int arr[],int target){
        int left = 0;
        int right = arr.length-1;
        while(left<=right) {
            int middle = (left+right)/2;
            if(arr[middle] == target) {
                return middle;
            } else if(arr[middle]<target){
                left = middle+1;
            } else {
                right = middle-1;
            }
        }
        return -1;
    }
}
