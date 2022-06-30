package com.itheima02_接口.p02接口多实现;

public class MyInterImpl implements MyInterA, MyInterB {

    //多个父接口中相同的抽象方法，实现类只需要重写1次
    public void abstractMethod() {
        System.out.println("实现类重写了接口的抽象方法");
    }

    //多个父接口中相同的默认方法，实现类必须重写1次。
    public void defaultMethod() {
        System.out.println("实现类重写了接口中的默认方法");
    }
}
