package com.itheima03_抽象类.p01抽象类入门;

public abstract class Animal {
    //public void eat(){
    //    //??写啥
    //    System.out.println("吃东西");//相当于一句废话  有意义:万一子类漏写了，至少还有东西。
    //    //不够好，有没有更好的办法？
    //    //更好的办法  1.当前方法的方法体其实不知道写什么？干脆不写。  2.要求子类必须重写。
    //}

     public abstract void eat();
}
