package com.itheima.demo12_多线程原子性问题演示;

/**
 * @author jialefei
 * @date 2022/4/25 10:42
 */
public class Test {
    //需求:通过主线程和子线程对一个变量各递增100000次，预期得到结果
    public static void main(String[] args) throws InterruptedException {
        //创建子线程并启动
        CountThread t = new CountThread();
        t.start();

        //主线程中对count变量递增十万次
        for (int i = 0; i < 100000; i++) {
            t.count++;
        }

        //睡一会，等子线程执行完成
        Thread.sleep(1000);

        //打印结果
        //期望值:二十万
        System.out.println("最终的记过是:"+t.count);
    }
}
