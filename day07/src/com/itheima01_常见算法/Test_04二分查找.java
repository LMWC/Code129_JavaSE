package com.itheima01_常见算法;

import java.util.Scanner;

/*
1.概述
	二分查找也称折半查找（Binary Search），它是一种效率较高的查找方法。
	但是，折半查找要求线性表必须采用顺序存储结构，而且表中元素按关键字有序排列。
2.原理
	找到首位置和末位置，根据这两个位置获取中间位置(首位置要小于末位置)；
	利用中间位置获取中间元素，与要查找的元素作比较。
	若查找元素比中间元素大(首位置=中间位置+1)，若查找元素比中间元素小(末位置=中间位置-1)，重复上面步骤
	若查找元素等于中间元素，即为找到，结束查找过程。

需求:将{1, 4, 16, 22, 25, 44, 55, 67, 88, 100}存入数组，并查找制定数值的位置

 */
public class Test_04二分查找 {
    public static void main(String[] args) {

        //定义数组
        int[] arr = {1, 4, 16, 22, 25, 44, 55, 67, 88, 100};

        //准备数据
        //要查找的数值
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要查找的数值");
        int findNum = sc.nextInt();
        //左边的索引
        int left = 0;
        //右边的索引
        int right = arr.length - 1;
        //中间的索引
        int middle = (left + right) / 2;
        //定义记录位置的变量
        int index = -1;

        //左边的索引>右边索引  不找了   (左边的索引<=右边索引  一直找(直到找到了))
        //找到了 不找了
        while (left<=right){
            //找位置
            if (arr[middle] == findNum) {
                //找到了，记录找到的索引位置
                index = middle;
                break;
            } else if (arr[middle] < findNum) {
                //往右边找，需要left往中间位置的右边移动1位
                left = middle + 1;
            } else {
                right = middle - 1;
            }
            //重新修改中间的位置
            middle = (left + right) / 2;
        }

        //根据index索引值，判断是否找到了
        if (index == -1) {
            System.out.println("没找到");
        } else {
            System.out.println(findNum + "在数组的第" + (index + 1) + "位置");
        }
    }
}
