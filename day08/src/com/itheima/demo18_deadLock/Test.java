package com.itheima.demo18_deadLock;

/**
 * @author jialefei
 * @date 2022/4/25 14:31
 */
public class Test {
    public static void main(String[] args) {
        //死锁产生条件
        //        有多把锁
        //        有多个线程
        //        有线程同步嵌套
        //1.有多把锁
        Object lockA = new Object();
        Object lockB = new Object();
        //2.创建两个线程并启动
        new Thread(){
            @Override
            public void run() {
              while (true){
                  synchronized (lockA){
                      System.out.println("线程1:获取A锁");

                      //等待获取B锁
                      synchronized (lockB){
                          System.out.println("线程1:获取B锁");
                      }
                      //释放B锁
                  }
                  //释放A锁
              }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
              while (true){
                  synchronized (lockB){
                      System.out.println("线程2:获取B锁");

                      //等待获取A锁
                      synchronized (lockA){
                          System.out.println("线程2:获取A锁");
                      }
                      //释放A锁
                  }
                  //释放B锁
              }
            }
        }.start();
    }
}
