package com.itheima01_Generic;

import java.util.ArrayList;

/*
泛型通配符
    1.概述
    	泛型的使用不存在继承关系，不可以给已指定泛型的变量接收有其他泛型类型的对象。
    		例如:ArrayList<Object> list = new ArrayList<String>()//错误格式，泛型不存在继承关系
    	泛型通配符用问号(?)表示。用于限制泛型数据类型的定义区间。单独使用表示任意类型，与不写的效果相同。。
    2.使用格式
    	数据类型<?> 对象名;
    	对象名 = 带具体泛型类型的对象;
泛型受限
    1.概述:限制泛型数据类型的定义区间
    2.使用格式
        泛型的上限：接收泛型为该泛型数据类型或其子类的对象
            格式：数据类型 <? extends 泛型数据类型 > 对象名称
        泛型的下限：接收泛型为该泛型数据类型或其父类的对象
            格式： 数据类型 <? super 泛型数据类型 > 对象名称
泛型受限的应用
    1.概述:在开发中，对于有泛型限制的定义,通常将这样的变量作为参数，控制接受数据的泛型类型。
    2.应用形式
    	形式1：修饰符  返回值 方法名(类名<?> 变量名){}//单独使用，没有意义
    	形式2：修饰符  返回值 方法名(类名<? extends 数据类型>  变量名){}
    	形式3：修饰符  返回值 方法名(类名<? super 数据类型>  变量名){}
示例：定义父子孙三个类，在测试类中演示泛型受限的使用

 */
public class Test_03泛型通配符 {
    public static void main(String[] args) {
        //定义存储父子孙类型的集合
        ArrayList<Fu> listFu = new ArrayList<>();
        ArrayList<Zi> listZi = new ArrayList<>();
        ArrayList<Sun> listSun = new ArrayList<>();
        //定义一个含有父类型泛型的集合
        ArrayList<Fu> list;
        list = listFu;
        //泛型不支持继承关系的。
        //list =listZi;
        //list=listSun;

        //为了集合的变量，能够接收任意泛型的对象。需要使用泛型通配符 ？
        ArrayList<?> list2;
        list2 = listFu;
        list2 = listZi;
        list2 = listSun;
        //泛型受限:   需求:将来需要对传入的泛型的类型做范围的限制。
        //1.需要接收的泛型的类型，是子类或其父类。(泛型的下限)  ?  super   Zi
        ArrayList<? super Zi> list3;
        list3 = listFu;
        list3 = listZi;
        //list3 = listSun;
        //2.需要接收的泛型的类型，是子类或其子类。(泛型的上限)  ?  extends  Zi
        ArrayList<? extends Zi> list4;
        //list4 = listFu;
        list4 = listZi;
        list4 = listSun;

        //泛型受限的应用
        show(listFu);
        show(listZi);
        //show(listSun);
        //show2(listFu);
        show2(listZi);
        show2(listSun);
    }

    public static void showStudent(ArrayList<?> list) {

    }

    public static void show(ArrayList<? super Zi> list) {

    }

    public static void show2(ArrayList<? extends Zi> list) {

    }
}
