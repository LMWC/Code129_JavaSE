package com.itheima.demo9_正则表达式语法;

public class Test1_字符类 {
    public static void main(String[] args) {
        //字符类语法
        //1. [abc]：代表a或者b，或者c字符中的一个。
        //2. [^abc]：代表除a,b,c以外的任何字符。
        //3. [a-z]：代表a-z的所有小写字符中的一个。
        //4. [A-Z]：代表A-Z的所有大写字符中的一个。
        //5. [0-9]：代表0-9之间的某一个数字字符。
        //6. [a-zA-Z0-9]：代表a-z或者A-Z或者0-9之间的任意一个字符。
        //7. [a-dm-p]：a 到 d 或 m 到 p之间的任意一个字符。
        //演示
        //需求:按照如下要求，使用正则表达式，完成字符串内容的验证。
        //1. 验证str是否以h开头，以d结尾，中间是a,e,i,o,u中某个字符
        //2. 验证str是否以h开头，以d结尾，中间不是a,e,i,o,u中的某个字符
        //3. 验证str是否a-z的任何一个小写字符开头，后跟ad
        //4. 验证str是否以a-d或者m-p之间某个字符开头，后跟ad

        //定义正则表达式
        String regex = "h[aeiou]d";
        System.out.println("had".matches(regex));
        System.out.println("hbd".matches(regex));
        System.out.println("--------");

        String regex2 = "h[^aeiou]d";
        System.out.println("had".matches(regex2));
        System.out.println("hbd".matches(regex2));
        System.out.println("--------");

        String regex3 = "[a-z]ad";
        System.out.println("had".matches(regex3));
        System.out.println("hbd".matches(regex3));
        System.out.println("--------");

        String regex4 = "[a-dm-p]ad";
        System.out.println("had".matches(regex4));
        System.out.println("hbd".matches(regex4));
        System.out.println("aad".matches(regex4));

    }
}
