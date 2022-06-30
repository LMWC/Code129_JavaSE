package com.itheima.demo1_计时等待;

/**
 * @author jialefei
 * @date 2022/4/26 8:49
 */
public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("开始");
        Object lock = new Object();
        //注意:wait必须有锁对象来调用
        synchronized (lock){
            lock.wait(3000);
        }

        System.out.println("结束");
    }
}
