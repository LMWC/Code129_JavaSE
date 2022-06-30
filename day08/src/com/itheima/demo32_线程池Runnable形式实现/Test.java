package com.itheima.demo32_线程池Runnable形式实现;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author jialefei
 * @date 2022/4/25 16:27
 */
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //获取线程池对象
        //Executors工具类中的newFixedThreadPool获取线程池对象
        //public static ExecutorService newFixedThreadPool(int nThreads)
        //Executors的静态方法，返回线程池对象
        //nThreads线程池中线程的个数

        //public Future<?> submit(Runnable task):获取线程池中的某一个线程对象，并执行

        //获取线程池对象
        ExecutorService e = Executors.newFixedThreadPool(2);
        //创建任务对象
        MyRunnable r = new MyRunnable();
        //将任务提交给线程池
        Future<?> result = e.submit(r);
        System.out.println(result.get());

        for (int i = 0; i < 10; i++) {
            e.submit(r);
        }
    }
}
