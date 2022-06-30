package com.itheima01_常见算法;

import java.util.Arrays;

/*
1.概述
	选择排序（Selection sort）是一种简单直观的排序算法。
2.原理
	从第一个开始，与后面元素比较。如果前面比后面大，就交换他们两个；
	用第一个与后续每一个做同样的工作，直到最后一个。此时，最前面的元素会是最小值。
	从第二个开始对所有的元素重复以上的步骤，不含上一轮最前一个；
	重复上述步骤，直到没有任何一对需要比较；

需求:在数组中存储，{7, 6, 5, 4, 3}五个数据，并使用选择进行排序

 */
public class Test_02选择排序 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {7, 6, 5, 4, 3};
        //轮数=数组长度-1
        for (int i = 0; i < arr.length - 1; i++) {//i有效范围:0~3

            for (int j = i + 1; j < arr.length; j++) {//j有效范围:(index+1)~4
                //System.out.println(j);
                //前面:index    后面:j
                //比较两个元素，如果后面比前面小，交换位置
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        ////获取每一个索引
        //int index = 0;
        //for (int j = index + 1; j < arr.length; j++) {//j有效范围:(index+1)~4
        //    //System.out.println(j);
        //    //前面:index    后面:j
        //    //比较两个元素，如果后面比前面小，交换位置
        //    if (arr[j] < arr[index]) {
        //        int temp = arr[index];
        //        arr[index] = arr[j];
        //        arr[j] = temp;
        //    }
        //}
        //
        //index = 1;
        //for (int j = index + 1; j < arr.length; j++) {//j有效范围:(index+1)~4
        //    //System.out.println(j);
        //    //前面:index    后面:j
        //    //比较两个元素，如果后面比前面小，交换位置
        //    if (arr[j] < arr[index]) {
        //        int temp = arr[index];
        //        arr[index] = arr[j];
        //        arr[j] = temp;
        //    }
        //}
        //
        //index = 2;
        //for (int j = index + 1; j < arr.length; j++) {//j有效范围:(index+1)~4
        //    //System.out.println(j);
        //    //前面:index    后面:j
        //    //比较两个元素，如果后面比前面小，交换位置
        //    if (arr[j] < arr[index]) {
        //        int temp = arr[index];
        //        arr[index] = arr[j];
        //        arr[j] = temp;
        //    }
        //}
        //
        //index = 3;
        //for (int j = index + 1; j < arr.length; j++) {//j有效范围:(index+1)~4
        //    //System.out.println(j);
        //    //前面:index    后面:j
        //    //比较两个元素，如果后面比前面小，交换位置
        //    if (arr[j] < arr[index]) {
        //        int temp = arr[index];
        //        arr[index] = arr[j];
        //        arr[j] = temp;
        //    }
        //}
        //
        //System.out.println(Arrays.toString(arr));
    }
}
