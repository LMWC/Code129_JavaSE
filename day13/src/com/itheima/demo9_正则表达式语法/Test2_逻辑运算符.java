package com.itheima.demo9_正则表达式语法;

public class Test2_逻辑运算符 {
    public static void main(String[] args) {
        //逻辑运算符语法
        //1. &&：并且
        //2. | ：或者。
        //演示
        //需求:按照如下要求，使用正则表达式，完成字符串内容的验证。
        //1. 验证字符串是小写辅音字符开头，后跟ad  除了a,e,i,o,u之外,其他的都是辅音字母
        //2. 验证字符串是aeiou中的某个字符开头，后跟ad。

        String regex = "[[a-z]&&[^aeiou]]ad";
        System.out.println("aad".matches(regex));
        System.out.println("bad".matches(regex));
        System.out.println("--------");

        String regex2 = "[a|e|i|o|u]ad";
        System.out.println("aad".matches(regex2));
        System.out.println("bad".matches(regex2));
    }
}
