package com.itheima01_常见算法;

import java.util.Arrays;

/*
1.概述
	冒泡排序（Bubble Sort），是一种计算机科学领域的较简单的排序算法。
2.原理
	从第一个开始，比较相邻的元素。如果前面比后面大，就交换他们两个；
	对每一对相邻元素做同样的工作，直到最后一对。此时，最后的元素会是最大的数；
	从头开始对所有的元素重复以上的步骤，除了上一轮最后一个；
	重复上述步骤，直到没有任何一对需要比较；

需求:在数组中存储，{7, 6, 5, 4, 3}五个数据，并使用冒泡排序进行排序

 */
public class Test_01冒泡排序 {
    public static void main(String[] args) {
        //创建数组
        int[] arr = {7, 6, 5, 4, 3};
        //比较的轮数=元素的个数-1
        for (int i = 0; i < arr.length-1; i++) {//i有效范围:0~3 4轮
            System.out.println("轮数---------------------------"+i);
            //单轮的比较过程
            //遍历数组，获取每一个索引
            //arr.length-1是因为两两相邻做比较，如果这里不减1，i+1会出现角标越界
            //由于范围要越来越小，且轮数刚好越来越大，所以利用arr.length-i减小每轮执行次数
            for (int j = 0; j < arr.length-1-i; j++) {//i有效范围:0~3
                System.out.println("每一轮的比较"+j);
                //两两相邻的元素做比较  i 和 i+1
                //如果后面的元素比前面元素小，交换位置。
                if (arr[j+1]<arr[j]){
                    //交换位置
                    int temp= arr[j];//用临时遍历记录前面的元素
                    arr[j]=arr[j+1];//将后面的元素放到前面
                    arr[j+1]=temp;//将前面的元素放到后面
                }
            }
        }
        //打印结果:
        System.out.println(Arrays.toString(arr));
    }
}
