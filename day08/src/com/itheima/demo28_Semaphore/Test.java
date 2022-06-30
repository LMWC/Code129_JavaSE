package com.itheima.demo28_Semaphore;

import java.util.concurrent.Semaphore;

/**
 * @author jialefei
 * @date 2022/4/25 15:55
 */
public class Test {
    public static void main(String[] args) {
        //public Semaphore(int permits) 创建线程并发数量对象
        // permits 表示许可线程的个数

        //public void acquire()	表示获取许可
        //public void release()	表示释放许可


        //需求:只有两个搓澡师傅
        //创建Semaphore对象
        Semaphore s = new Semaphore(2);
        //创建线程对象并启动
        for (int i = 0; i < 10; i++) {
            new CuoZaoThread(s).start();
        }
    }
}
