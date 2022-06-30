package com.itheima02_Extends.p04this的使用;

public class Zi extends Fu {
    int num =666;
    public Zi(){
        //super();
        //调用本类构造方法，让num的值，在使用默认构造方法的时候，结果为999
        //调用本类构造方法的操作必须放在第一行。
        //如果用this调用本类的构造方法，super()访问父类的默认构造方法，将被替换掉。
        //this调用本类构造方法的操作，一般都不会使用。
        //使用场景:类似的，需要在调用某个方法的时候，就让类中的内容有默认的初始值。
        this(6666);
        System.out.println("子类无参构造方法");

    }
    public Zi(int num){
        //super();
        this.num=num;
    }
    @Override
    public void method() {
        System.out.println("子类中的method方法");
    }

    public void show(){
        int num =999;
        //this修饰变量的使用
        System.out.println("局部变量num="+num);
        System.out.println("成员变量num="+this.num);
        //this修饰方法
        method();//遵守就近原则
        this.method();//调用本类中的方法，加不加this没有区别。一般不加。
    }
}
