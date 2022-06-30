package com.itheima02_Extends.p05super的使用;

public class Zi extends Fu {
    int num=666;

    public Zi(){
        System.out.println("子类无参构造方法");
    }

    public Zi(int num){
        this.num=num;
    }

    public Zi(int fuNum,int ziNum){
        super(fuNum);//默认调用父类无参的被替换掉了
        this.num=ziNum;
        //super.num=fuNum;//这样，就可以在创建子类对象的时候，直接给父类改变了赋值。很low。

    }
    @Override
    public void method() {
        //一般重写方法，在一些时候，保留原有的功能的基础上，进行增强。
        super.method();
        System.out.println("子类中的method方法");
    }

    public void show(){
        int num=999;
        //super修饰变量
        System.out.println("局部的num="+num);
        System.out.println("本类成员位置的num="+this.num);
        System.out.println("父类成员位置的num="+super.num);

        //修饰方法
        method();//相当于this.method();
        //在特定的位置，想要访问父类中的method方法
        super.method();
    }
}
