package com.itheima03_常用API;

import java.util.Arrays;

public class Test_09Arrays {
    public static void main(String[] args) {
        //Arrays是数组的工具类

        int[] arr ={1,2,3,4,5};
        String s = Arrays.toString(arr);
        System.out.println(s);

        int[] arr2 ={2,1,4,3,5};
        System.out.println("排序前:"+Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("排序后:"+Arrays.toString(arr2));
    }
}
