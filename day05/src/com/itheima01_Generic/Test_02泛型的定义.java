package com.itheima01_Generic;

/*
含有泛型的类
    1.概述
    	泛型是数据类型的一部分，将类名与泛型合并一起看做数据类型，定义对象时，确定泛型类型。
    	类上添加泛型的使用，可以让在多处操作需要统一数据类型时的限制操作。
    2.定义格式
    	修饰符 public  class 类名<代表泛型的变量> {
    		//应用1:作为方法的参数
    		//应用2:作为方法的返回值类型
    	}
    3.使用格式
    	属性类型<泛型类型> 变量名  = new 数据类型<>();//常见使用
    	属性类型<泛型类型> 变量名  = new 数据类型<泛型类型>();
    	属性类型<泛型类型> 变量名  = new 数据类型();

含有泛型的方法
    1.概述 泛型接口约束实现类是含有泛型的类型，实现类要么保留泛型，要么指定泛型的具体类型。
    2.定义格式
    	修饰符 interface 接口名 <代表泛型的变量> { }
    3.使用格式
    	格式一:修饰符 public  class 类名 implements  接口名 <数据类型> { }
    	格式二:修饰符 public  class 类名<代表泛型的变量> implements  接口名 <代表泛型的变量> { }


含有泛型的接口
    1.概述 定义泛型的方法，泛型用于参数或返回值类型，效果类似参数为Object的使用，但避免了向下转型。
    2.定义格式
    	饰符  <代表泛型的变量> 返回值类型 方法名(代表泛型的变量  变量名...){  }
    3.使用格式
    	对象.方法名(实际参数);
案例：测试类中定义泛型，并使用。

 */
public class Test_02泛型的定义 {
    public static void main(String[] args) {
        //1.含有泛型的类，定义变量的时候，指定泛型的类型。
        GenericClass<String> gc = new GenericClass<>();
        //GenericClass<String> gc = new GenericClass<String>();
        //GenericClass<String> gc = new GenericClass();
        gc.method1("abc");
        System.out.println(gc.method2());

        //含有泛型的方法
        GenericMethod gm = new GenericMethod();
        gm.method1("abc");
        String s = gm.method2();
        System.out.println(s);

        //含有泛型接口
    }
}
