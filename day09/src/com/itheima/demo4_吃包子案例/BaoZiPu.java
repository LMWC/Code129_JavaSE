package com.itheima.demo4_吃包子案例;

/**
 * @author jialefei
 * @date 2022/4/26 9:48
 */
public class BaoZiPu extends Thread {
    private BaoZi bz;

    public BaoZiPu(BaoZi bz, String name) {
        super(name);
        this.bz = bz;
    }

    @Override
    public void run() {
        //定义一个用于修改包子皮和馅的变量
        int index = 0;

        while (true) {
            synchronized (bz) {
                //判断如果有包子，设置为等待状态
                if (bz.flag) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //如果没有包子  或者  包子被吃完了
                //做包子
                if (index % 2 == 0) {
                    bz.pier = "糯米皮";
                    bz.xianer = "猪肉大葱";
                } else {
                    bz.pier = "面皮";
                    bz.xianer = "韭菜鸡蛋";
                }
                index++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(getName() + "：包子做好了");
                //修改有包子的状态
                bz.flag = true;
                //告诉别人吃包子
                bz.notify();
            }
        }
    }
}
