package com.itheima01_权限修饰符.A;

public class OtherA {
    public void show(){
        //没有子父关系，不能直接通过名字使用。需要创建另一个类的对象访问
        Fu f = new Fu();
        //System.out.println("同一个包下无关的类的私有的变量priNum:" + f.priNum);//私有的内容，只能在本类中直接访问
        System.out.println("同一个包下无关的类的默认的变量num:" + f.num);
        System.out.println("同一个包下无关的类的受保护的变量proNum:" + f.proNum);
        System.out.println("同一个包下无关的类的公共的变量pubNum:" + f.pubNum);
    }
}
