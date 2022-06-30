package com.itheima02_异常;

/*
1.概述
	在方法内部，抛出(产生)一个描述问题的异常对象
2.格式
	throw new 异常类名(参数);
3.应用
	Objects类中的静态方法public static <T> T requireNonNull(T obj)：查看指定引用对象不是null。
	public static <T> T requireNonNull(T obj) {
            if (obj == null){
                //对为null的情况执行抛出空指针异常对象，并默认交由调用者处理。
              	throw new NullPointerException();
            }
            return obj;
        }


需求:演示抛出除数为0异常
 */
public class Test_02抛出异常 {
    public static void main(String[] args) {
        //System.out.println(10/0);

        int a = 10;
        int b = 0;
        if (b == 0) {
            //抛出异常对象 ArithmeticException
            throw new ArithmeticException("除数为0");
            //System.out.println("除数为0");
        } else {
            System.out.println(a / b);
        }

        System.out.println("结束");
    }
}
