package com.itheima.demo10_同步机制解决可见性问题;

/**
 * @author jialefei
 * @date 2022/4/25 10:03
 */
public class Test {
    public static void main(String[] args) {
        //在主线程使用开关变量，在子线程中修改开关变量

        //创建开关变量线程对象并启动
        OpenCloseThread t = new OpenCloseThread();
        t.start();

        //由于while底层原理，造成主线程中对于flag的高速访问，导致没有获取子线程中flag修改后的值。
        while (true) {
            //如果flag为true，主线程就会结束
            synchronized (t) {
                if (t.flag) {
                    break;
                }
            }

        }

        System.out.println("主线程结束了...");
    }
}
