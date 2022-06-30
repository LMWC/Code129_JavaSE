package com.itheima.demo7_同步方法锁验证;

/**
 * @author jialefei
 * @date 2022/4/25 9:41
 */
public class Test {
    public static void main(String[] args) {
        //静态同步方法锁:所在类的字节码文件(类名.class)
        //method1();
        //非静态同步方法锁:this
        method2();
    }

    public static void method2() {
        //创建并启动非静态同步方法线程对象
        MethodThread t = new MethodThread();
        t.start();

        synchronized (t) {
            System.out.println("主线程:开门");
            System.out.println("主线程:打火");
            System.out.println("主线程:驾驶");
            System.out.println("主线程:熄火");
            System.out.println("主线程:停车");
        }
    }

    public static void method1() {
        //创建并启动静态同步方法线程对象
        new StaticMethodThread().start();

        synchronized (StaticMethodThread.class) {
            System.out.println("主线程:开门");
            System.out.println("主线程:打火");
            System.out.println("主线程:驾驶");
            System.out.println("主线程:熄火");
            System.out.println("主线程:停车");
        }
    }
}
