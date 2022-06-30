package com.itheima.demo9_多线程可见性问题;

/**
 * @author jialefei
 * @date 2022/4/25 10:04
 */
public class OpenCloseThread extends Thread {
    boolean flag = false;

    @Override
    public void run() {

        //三秒中以后，修改开关变量的值
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = true;
        System.out.println("开关变量的值被修改为了:" + flag);
    }
}
