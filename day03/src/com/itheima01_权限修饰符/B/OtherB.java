package com.itheima01_权限修饰符.B;

import com.itheima01_权限修饰符.A.Fu;

public class OtherB {
    public void show(){
        Fu f = new Fu();
        //System.out.println("不同包下无关的类的私有的变量priNum:" + f.priNum);//私有的内容，只能在本类中直接访问
        //System.out.println("不同包下无关的类的默认的变量num:" + f.num);//默认权限只能在同一个包中使用
        //System.out.println("不同包下无关的类的受保护的变量proNum:" + f.proNum);//同一个包中   子父类
        System.out.println("不同包下无关的类的公共的变量pubNum:" + f.pubNum);
    }
}