package com.itheima01_权限修饰符.B;

import com.itheima01_权限修饰符.A.Fu;

public class ZiB extends Fu {
    public void show(){
        //System.out.println("不同包下父类的私有的变量priNum:" + priNum);//私有的内容，只能在本类中直接访问
        //System.out.println("不同包下父类的默认的变量num:" + num);//默认权限，只能在同一个包中使用
        System.out.println("不同包下父类的受保护的变量proNum:" + proNum);
        System.out.println("不同包下父类的公共的变量pubNum:" + pubNum);
    }
}
