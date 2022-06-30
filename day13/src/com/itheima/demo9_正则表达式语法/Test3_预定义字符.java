package com.itheima.demo9_正则表达式语法;

public class Test3_预定义字符 {
    public static void main(String[] args) {
        //预定义字符语法
        //1. "." ： 匹配任何字符。如果要表示一个字符点,那么就得使用\\.
        //2. "\d"：任何数字[0-9]的简写；
        //3. "\D"：任何非数字\[^0-9\]的简写；
        //4. "\s"： 空白字符：[ \t\n\x0B\f\r] 的简写
        //5. "\S"： 非空白字符：\[^\s\] 的简写
        //6. "\w"：单词字符：[a-zA-Z_0-9]的简写
        //7. "\W"：非单词字符：\[^\w\]
        //演示
        //需求:按照如下要求，使用正则表达式，完成字符串内容的验证。
        //1. 验证str是否3位数字
        //2. 验证手机号：1开头，第二位：3/5/8，剩下9位都是0-9的数字
        //3. 验证字符串是否以h开头，以d结尾，中间是任何字符
        //4. 验证str是否是：had. 。

        String regex = "\\d\\d\\d";
        System.out.println("123".matches(regex));
        System.out.println("a23".matches(regex));
        System.out.println("--------");

        String regex2 = "1[358]\\d\\d\\d\\d\\d\\d\\d\\d\\d";
        System.out.println("13888888888".matches(regex2));
        System.out.println("14888888888".matches(regex2));
        System.out.println("--------");

        String regex3 = "h.d";
        System.out.println("had".matches(regex3));
        System.out.println("ha".matches(regex3));
        System.out.println("hd".matches(regex3));

        System.out.println("--------");
        String regex4 = "had\\.";
        System.out.println("had.".matches(regex4));
        System.out.println("hada".matches(regex4));
    }
}
