package com.itheima.demo33_线程池Callable形式实现;

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

        //public Future<?> submit(Callable task):获取线程池中的某一个线程对象，并执行。

        //创建线程池对象
        ExecutorService pool = Executors.newFixedThreadPool(2);
        //创建任务对象
        MyCallable c = new MyCallable();
        //提交任务
        Future<String> result = pool.submit(c);
        System.out.println(result.get());

        for (int i = 0; i < 10; i++) {
            pool.submit(c);
        }
    }
}
