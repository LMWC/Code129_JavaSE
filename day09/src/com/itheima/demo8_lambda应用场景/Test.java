package com.itheima.demo8_lambda应用场景;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author jialefei
 * @date 2022/4/26 10:48
 */
public class Test {
    public static void main(String[] args) {
        //创建对象，赋值给变量
        Runnable r = () -> {
            System.out.println("要执行的任务");
        };
        //在调用方法时，作为“实参”
        List<Integer> list = new ArrayList<>();
        Collections.sort(list, (i1, i2) -> {
            return i1 - i2;
        });
        //作为方法的“返回值”
        Runnable r2 = getRunnable();
    }

    public static Runnable getRunnable() {
        return () -> {
            System.out.println("要执行的任务");
        };
    }
}
