package com.itheima02_异常;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
1.概述
	处理异常的方式，在方法上声明方法中存在的一个或多个问题标识，提醒调用者处理这些异常
2.格式
	修饰符 返回值类型 方法名(参数)  throws 异常类名1,异常类名2…{//方法体   }
3.应用
	运行时异常,默认被声明(也可以显示抛出)
	编译时异常，未捕获，就必须通过throws声明，否则编译报错
	当异常出现，将这个异常对象传递给调用者，并结束当前方法。

需求:通过除数为0异常和日期解析异常，演示thorws的使用
 */
public class Test_03声明异常 {
    //所有的方法默认声明了RuntimeException
    public static void main(String[] args) /*throws RuntimeException */ throws ParseException {
        System.out.println(10 / 0);//ArithmeticException  运行时异常

        method();
    }

    public static void method() throws ParseException {
        String time = "2000-12-12";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse(time);//ParseException  编译时异常
    }
}
