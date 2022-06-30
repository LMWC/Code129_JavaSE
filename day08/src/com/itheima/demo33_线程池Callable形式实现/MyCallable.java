package com.itheima.demo33_线程池Callable形式实现;

import java.util.concurrent.Callable;

/**
 * @author jialefei
 * @date 2022/4/25 16:29
 */
public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("使用Callable提交任务");
        return "callable返回的数据";
    }
}
