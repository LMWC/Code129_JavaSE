package com.itheima.demo8_正则表达式体验;

public class Test {
    public static void main(String[] args) {
        //分别使用if语句和正则表达式，对用户输入一个QQ号码做验证操作。要求同时符合一下三个规则才算通过验证。
        //规则1:QQ号码必须是5--15位长度
        //规则2:而且首位不能为0
        //规则3:而且必须全部是数字

        //常规方式
        //method1();

        //正则表达式
        String qq = "595688889999999998";
        String regex = "[1-9][0-9]{4,14}";
        System.out.println(qq.matches(regex));
    }


    public static void method1() {
        String qq = "595688888";
        boolean flag = true;
        //规则1:QQ号码必须是5--15位长度
        if (!(qq.length() >= 5 && qq.length() <= 15)) {
            flag = false;
        }

        //规则2:而且首位不能为0
        if (!(qq.charAt(0) != '0')) {
            flag = false;
        }
        //规则3:而且必须全部是数字

        for (int i = 0; i < qq.length(); i++) {
            char c = qq.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                flag = false;
                //有一个数字不符合规则，立刻结束
                break;
            }
        }
    }


    //争取看懂，练习逻辑能力。开发不会这么写。
    public static void method() {
        String qq = "595688888";
        boolean flag = true;
        //规则1:QQ号码必须是5--15位长度
        if (!(qq.length() >= 5 && qq.length() <= 15)) {
            //规则2:而且首位不能为0
            if (!(qq.charAt(0) != '0')) {
                //规则3:而且必须全部是数字
                for (int i = 0; i < qq.length(); i++) {
                    char c = qq.charAt(i);
                    if (c < '0' && c > '9') {
                        flag = false;
                        break;
                    }
                }
            } else {
                flag = false;
            }
        } else {
            flag = false;
        }
    }
}
