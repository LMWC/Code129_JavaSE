package com.itheima.demo9_正则表达式语法;

public class Test4_数量词 {
    public static void main(String[] args) {
        //数量词语法
        //1. X? : 0次或1次
        //2. X* : 0次到多次
        //3. X+ : 1次或多次
        //4. X{n} : 恰好n次
        //5. X{n,} : 至少n次
        //6. X{n,m}: n到m次(n和m都是包含的)。
        //演示
        //需求:按照如下要求，使用正则表达式，完成字符串内容的验证。
        //1. 验证str是否是三位数字
        //2. 验证str是否是多位数字
        //3. 验证str是否是手机号

        String regex = "\\d{3}";
        System.out.println("123".matches(regex));
        System.out.println("a23".matches(regex));
        System.out.println("--------");


        String regex2 = "\\d+";
        System.out.println("123".matches(regex2));
        System.out.println("123456789".matches(regex2));
        System.out.println("a23".matches(regex2));
        System.out.println("--------");

        String regex3 = "1[358]\\d{9}";
        System.out.println("13888888888".matches(regex3));
        System.out.println("14888888888".matches(regex3));
    }
}
