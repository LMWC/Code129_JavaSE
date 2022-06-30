package com.itheima.demo27_CyclicBarrier;

/**
 * @author jialefei
 * @date 2022/4/25 15:46
 */
public class MeetingRunnable  implements Runnable{
    @Override
    public void run() {
        System.out.println("人到齐了，开始开会...");
    }
}
