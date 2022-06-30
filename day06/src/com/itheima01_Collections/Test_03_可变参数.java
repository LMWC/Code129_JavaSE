package com.itheima01_Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
1.概述
	在JDK1.5之后，定义了可变参数，用来表示一个方法需要接受的多个同类型参数。
2.定义格式
	参数类型... 形参名
3.注意事项
	一个方法只能有一个可变参数
	如果方法中有多个参数，可变参数要放到最后
4.应用场景
	用于Collections类的添加功能，如下
	public static <T> boolean addAll(Collection<T> c,T...elements):往集合中添加一些元素

需求:演示可变参数在集合工具的添加方法中的应用


 */
public class Test_03_可变参数 {
    public static void main(String[] args) {
        System.out.println(getSum(10, 20));
        System.out.println(getSum(10,20,30));
        System.out.println(getSum(10,20,30,40));
        int[] arr={10,20};
        System.out.println(getSum(arr));
        System.out.println("-------");

        //注意事项
        method(10,20,30);

        System.out.println("-------");

        //可变参数应用
        Collection<Integer> c = new ArrayList<>();
        Collections.addAll(c,1,2,3,4,5);
        System.out.println(c);
    }
    //可变参数作为形参
    public static int getSum(int...nums){
        int sum = 0;
        //遍历数组
        for (int i = 0; i < nums.length; i++) {
            //累加求和
            sum += nums[i];
        }
        return sum;
    }
    //可变参数注意事项
    //可变参数的前面，可以加若干个单个的参数
    public static void method(int num ,int...nums){}
    public static void method2(int num ,int num2,int...nums){}
    //可变参数不能在前面(可变参数的后面不能加单个的参数)
    //public static void method3(int...nums,int num){}
    //方法形参中不能有多个可变参数
    //public static void method3(int...nums,String...strs){}





    //public static int getSum(int a, int b) {
    //    return a + b;
    //}
    //
    //public static int getSum(int a, int b, int c) {
    //    return a + b;
    //}

    //不足:如果想求三个数的和，还得先去准备一个数组。
    //public static int getSum(int[] arr) {
    //    int sum = 0;
    //    //遍历数组
    //    for (int i = 0; i < arr.length; i++) {
    //        //累加求和
    //        sum += arr[i];
    //    }
    //    return sum;
    //}


}
