package com.itheima.demo34_线程池练习;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author jialefei
 * @date 2022/4/25 16:38
 */
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //使用线程池的方式，计算1-100的和

        ExecutorService pool = Executors.newFixedThreadPool(2);

        GetSumCallable c = new GetSumCallable();

        Future<Integer> result = pool.submit(c);

        System.out.println("结果:" + result.get());

        //线程池仍然处于运行状态(阻塞状态:等任务)
        //结束线程池
        //pool.shutdown(); //一般不关
    }
}
