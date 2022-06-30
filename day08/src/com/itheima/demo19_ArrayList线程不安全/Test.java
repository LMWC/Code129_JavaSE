package com.itheima.demo19_ArrayList线程不安全;

/**
 * @author jialefei
 * @date 2022/4/25 14:45
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        //创建子线程并启动
        ArrayListThread t = new ArrayListThread();
        t.start();


        //主线程中对子线程中的list集合添加十万次数据
        for (int i = 0; i < 100000; i++) {
            t.list.add(i);
        }

        //睡一会,等待子线程执行完成。
        Thread.sleep(1000);

        //打印结果
        //期望的集合的长度是:二十万
        System.out.println("list集合的长度是:"+t.list.size());
    }
}
