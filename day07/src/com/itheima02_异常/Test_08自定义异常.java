package com.itheima02_异常;

import java.util.Scanner;

/*
1.意义
	异常具备发生后的jvm阻断功能及finally的强制执行，且具备复用性，if语句只能解决基本的逻辑判断，异常更好用一些。
	像类一样，java中不可能为所有情况提供异常，开发中的一写异常类型需要根据业务自行定义.(例：年龄负数问题)
2.格式
	自定义编译期异常： 自定义类 并继承于java.lang.Exception
	自定义运行时期异常：自定义类 并继承于java.lang.RuntimeException
3.需求:
	模拟注册操作，如果用户名已存在，则抛出异常并提示：亲，该用户名已经被注册
4.分析
	首先定义一个注册异常类RegisterException
	模拟注册操作，使用数组模拟数据库中存储的数据，并提供当前注册账号是否存在方法用于判断。
*/
public class Test_08自定义异常 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (RegisterException e) {
            e.printStackTrace();
            System.out.println("亲,该用户已经被注册!");
        }


        method2();

    }
    public static void method1() throws RegisterException{
        //已存在的用户名
        String[] userNames  = {"zhangsaan","lisi","wangwu"};
        //用户录入用户名
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要注册的用户名");
        String myUserName = sc.nextLine();
        //判断用户名是否已存在
        //遍历用户名数组
        for (int i = 0; i < userNames.length; i++) {
            //获取数组中用户名
            String userName = userNames[i];
            //
            if (myUserName.equals(userName)){
                //该用户名已存在
                throw new RegisterException("your userNmae is used!");
            }
        }
    }

    public static void method2() {
        //已存在的用户名
        String[] userNames  = {"zhangsaan","lisi","wangwu"};
        //用户录入用户名
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要注册的用户名");
        String myUserName = sc.nextLine();
        //判断用户名是否已存在
        //遍历用户名数组
        for (int i = 0; i < userNames.length; i++) {
            //获取数组中用户名
            String userName = userNames[i];
            //
            if (myUserName.equals(userName)){
                //该用户名已存在
                try {
                    throw new RegisterException("your userNmae is used!");
                } catch (RegisterException e) {
                    e.printStackTrace();
                    System.out.println("亲,该用户已经被注册!");
                }
            }
        }
    }
}
