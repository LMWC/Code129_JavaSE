package com.itheima02_接口.p02接口多实现;

public abstract class AbstractMyInterImpl implements MyInterA,MyInterB {
    //实现类是抽象类，可以不重写抽象方法。

    //实现类是抽象类，接口中同名的默认方法也必须重写1次。
    public void defaultMethod() {
        System.out.println("抽象的实现类重写了接口中的默认方法");
    }
}
