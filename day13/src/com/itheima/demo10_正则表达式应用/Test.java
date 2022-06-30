package com.itheima.demo10_正则表达式应用;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //String类的常见方法
        //public String[] split(String regex)//将当前字符串中匹配regex正则表达式的符号作为"分隔符"来切割字符串。
        //public String replaceAll(String regex,String newStr)//将当前字符串中匹配regex正则表达式的字符串替换为newStr。
        //演示
        //需求1：使用String中的split方法，将字符串"18  4 567       99     56"以间隔进行分割
        //需求2：使用String中的replaceAll方法，将"jfdk432jfdk2jk24354j47jk5l31324"中的数字使用*进行替换。


        String regex = " +";
        String[] split = "18  4 567       99     56".split(regex);
        System.out.println(Arrays.toString(split));

        String regex2 = "\\d";
        String newStr = "jfdk432jfdk2jk24354j47jk5l31324".replaceAll(regex2,"*");
        System.out.println(newStr);

        String regex3 = "\\d+";
        String newStr2 = "jfdk432jfdk2jk24354j47jk5l31324".replaceAll(regex3,"**");
        System.out.println(newStr2);
    }
}
