package com.itheima01_static.p01基本应用;

/*
static概述
    1.static是静态修饰符，表示静态的意思,可以修饰类中成员(成员方法、成员变量、代码块等)。
    2.编码流程:编写--编译--运行(加载--执行)
    3.static修饰的内容是与对象无关的，即可以不通过对象操作。

修饰成员位置的变量:
    1.介绍：static修饰成员变量，称为类变量或静态变量，被该类的对象所共享，可以被任意对象(或直接通过类名)修改。
    2.定义格式：修饰符 static 数据类型 变量名；
    3.使用格式：类名.类变量名；

修饰成员位置的方法:
    1.介绍：static修饰方法，称为类方法或静态方法。类方法可以且建议直接使用类名调用。
    2.定义格式：
            修饰符 static 返回值类型 方法名 (参数列表){
        	    // 执行语句
            }
    3.使用格式：类名.静态方法名(参数)；
    4.注意事项:
    	静态方法可以直接访问类变量和静态方法。
    	静态方法不能直接访问普通成员变量或成员方法。
    	成员方法可以直接访问静态变量或静态方法。
    	静态方法中，不能使用this关键字。
修饰代码块
    1.介绍：
	    static修饰代码块，称为静态代码块。
	    位于成员位置，随着类的加载而执行(无需调用)。优先于main和构造方法。
    2.定义格式：
        static {}
 */
public class Test {
    //静态代码块随着字节码的加载执行，
    //字节码文件只会加载1次
    //代码执行前，先加载字节码文件。
    static {
        System.out.println("静态代码块");
    }


    public static void main(String[] args) {
        System.out.println("静态main方法");
        Test test = new Test();
        Test test2 = new Test();

        //1.static修饰的成员位置的变量
        StaticDemo sd1 = new StaticDemo();
        sd1.num = 100;
        sd1.staticNum = 999;
        StaticDemo sd2 = new StaticDemo();
        sd2.num = 1000;
        sd2.staticNum = 9999;

        System.out.println(sd1.num);//100
        System.out.println(sd1.staticNum);//9999
        System.out.println(sd2.num);//1000
        System.out.println(sd2.staticNum);//9999
        //推荐用类名调用静态变量
        StaticDemo.staticNum = 99999;
        System.out.println(sd1.staticNum);//99999
        System.out.println(sd2.staticNum);//99999
        System.out.println("--------");
        //2.staitc修饰静态方法
        StaticDemo.staticMethod();
        //sd2.staticMethod();//不推荐
    }


    //注意事项演示
    int num = 10;
    static int staticNum = 999;

    public void method() {
    }

    public static void staticMethod() {
    }

    public void show() {
        //成员方法可以直接访问静态变量或静态方法。
        System.out.println(staticNum);
        staticMethod();
    }

    public static void staticShow() {
        //this代表调用这个方法的对象，但是静态方法可能是通过类名调用的， 所以静态方法中没有this。
        //静态方法可以直接访问类变量和静态方法。
        System.out.println(staticNum);
        staticMethod();
        //静态方法不能直接访问普通成员变量或成员方法。
        //原因:静态的内容优先于非静态存在(使用)。
        //换个说法:静态的方法执行的时候，不能保证对象是存在的，而非静态的内容，必须通过对象来使用。
        //System.out.println(num);
        //method();
    }
}

