package com.itheima.demo4_吃包子案例;

/**
 * @author jialefei
 * @date 2022/4/26 9:54
 */
public class Test {
    public static void main(String[] args) {
        //创建包子对象
        BaoZi bz = new BaoZi();
        //创建吃货线程并启动
        new ChiHuoThread(bz, "张三").start();
        //创建包子铺线程并启动
        new BaoZiPu(bz, "包子铺").start();
    }
}
