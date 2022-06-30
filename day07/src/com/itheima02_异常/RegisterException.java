package com.itheima02_异常;

//自定义编译期异常： 自定义类 并继承于java.lang.Exception
//自定义运行时期异常：自定义类 并继承于java.lang.RuntimeException

public class RegisterException extends Exception {
    //手动提供了有参构造，无参构造则不存在
    public RegisterException(String s){
        super(s);
    }
}
