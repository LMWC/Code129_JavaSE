package com.itheima02_接口.p03继承并实现;

public class Zi extends Fu implements MyInter {

    //重写父类与接口中相同的抽象方法 只需重写1次
    public void abstractMethod(){
        System.out.println("子类重写了同名的抽象方法");
    }

    //优先级
    //父类的成员方法与接口的默认方法同名，优先使用父类的成员方法  所以这里可以不重写



    //虽然父类的静态方法，子类对象可以直接使用，但是我们仍然认为这不是继承

}
