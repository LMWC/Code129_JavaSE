package com.itheima01_权限修饰符.A;

public class ZiA extends Fu {
    public void show(){
        //System.out.println("同一个包下父类的私有的变量priNum:" + priNum);//私有的内容，只能在本类中直接访问
        System.out.println("同一个包下父类的默认的变量num:" + num);
        System.out.println("同一个包下父类的受保护的变量proNum:" + proNum);
        System.out.println("同一个包下父类的公共的变量pubNum:" + pubNum);
    }
}
