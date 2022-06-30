package com.itheima.demo4_吃包子案例;

/**
 * @author jialefei
 * @date 2022/4/26 9:43
 */
public class ChiHuoThread extends Thread {
    private BaoZi bz;

    public ChiHuoThread(BaoZi bz, String name) {
        super(name);
        this.bz = bz;
    }

    @Override
    public void run() {
       while (true){
           synchronized (bz) {
               //判断是否没有包子，如果没有，设置为等待状态
               if (!bz.flag) {
                   try {
                       bz.wait();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }

               //如果有包子或者 包子做好了
               System.out.println(getName()+":吃" + bz.pier + bz.xianer + "的包子");
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               //修改无包子的状态
               bz.flag = false;
               //通知别人做包子
               bz.notify();

           }
       }
    }
}
