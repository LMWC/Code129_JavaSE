package com.itheima.demo9_正则表达式语法;

public class Test5_分组 {
    public static void main(String[] args) {
        //分组语法
        //        ():将一系列操作作为一个整体来理解。
        //演示
        //1.需求:按照如下要求，使用正则表达式，完成"DG8FV-B9TKY-FRT9J-99899-XPQ4G"序列号字符串内容的验证。
        //2. 验证小数：要求匹配：3、3.0、3.14、+3.14、-3.0


        //"DG8FV-B9TKY-FRT9J-99899-XPQ4G"
        //初级思路: [A-Z0-9]{5}-[A-Z0-9]{5}-[A-Z0-9]{5}-[A-Z0-9]{5}-[A-Z0-9]{5}
        //错误语法
        //String regex = "[[A-Z0-9]{5}-]{4}[A-Z0-9]{5}";
        String regex = "([A-Z0-9]{5}-){4}[A-Z0-9]{5}";
        System.out.println("DG8FV-B9TKY-FRT9J-99899-XPQ4G".matches(regex));
        System.out.println("DG8FV-B9TKY-FRT9J-99899-XPQ4G-".matches(regex));
        System.out.println("--------");

        String regex2 = "[+-]?3(\\.\\d+)?";
        System.out.println("3".matches(regex2));
        System.out.println("+3".matches(regex2));
        System.out.println("+3.14".matches(regex2));
        System.out.println("+3.".matches(regex2));
        System.out.println("+3.1.1".matches(regex2));
    }
}
