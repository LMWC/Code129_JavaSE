package com.itheima.demo27_CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

/**
 * @author jialefei
 * @date 2022/4/25 15:44
 */
public class Test {
    public static void main(String[] args) {
        //public CyclicBarrier(int parties, Runnable barrierAction)： 创建同步辅助操作任务类的对象
        //parties表示指定的线程到达指定操作数线程数量。
        //barrierAction线程数量达到之后，要做的事情。

        //public int await()  让指定的线程在指定的位置停下来，知道在这里停下来的线程数量达到parties。



        //需求:将来要求会议室的人数达到了5个人，会议就开始。
        //创建任务对象
        MeetingRunnable r = new MeetingRunnable();
        //CyclicBarrier对象
        CyclicBarrier c = new CyclicBarrier(5,r);

        //创建会议人员线程对象并启动
        new PeopleThread(c,"张三:").start();
        new PeopleThread(c,"李四:").start();
        new PeopleThread(c,"王五:").start();
        new PeopleThread(c,"赵六:").start();
        new PeopleThread(c,"孙七:").start();
    }
}
