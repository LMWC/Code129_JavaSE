package com.itheima02.demo5_递归入门;

public class Test {
    public static void main(String[] args) {
        //递归:方法中调用方法自己
        //注意:会由于高速的，大量的调用自己造成内存溢出从问题。
        //解决:如果书写递归的代码
        //1.规律
        //2.出口

        diGui(5);
    }

    public static void diGui(int count) {
        //出口
        if (count == 0) {
            return;
        }
        //规律
        System.out.println("递归调用");
        diGui(count - 1);
    }
}
