package com.itheima.demo34_线程池练习;

import java.util.concurrent.Callable;

/**
 * @author jialefei
 * @date 2022/4/25 16:39
 */
public class GetSumCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum =0;
        for (int i = 1; i <= 100; i++) {
            sum+=i;
        }
        return sum;
    }
}
