package com.itheima03_多态.p02多态时访问特点;

/*
多态时访问特点
    访问格式:
        对象名.成员变量名;
        对象名.方法名();
    访问特点
        成员变量:编译看左边,运行看左边  (编译时看父类,运行时找父类)
        成员方法:编译看左边,运行看右边  (编译时看父类,运行时找子类)
        静态方法:编译看左边,运行看左边  (编译时看父类,运行时找父类)
 */
public class Test {
    public static void main(String[] args) {
        //多态场景下访问规则
        Fu f = new Zi();
        //上面的多态体现格式 左边:等于号左边变量的类   右边:等于号右边对象的类
        //1.成员变量  编译看左边,运行看左边
        System.out.println(f.num);//10
        //System.out.println(f.num2);

        //2.成员方法(重点) 编译看左边,运行看右边
        f.method();//子类的...
        //f.method2();

        //3.静态方法 编译看左边,运行看左边
        f.staticMethod();//父类的...
        //f.staticMethod2();
    }
}

