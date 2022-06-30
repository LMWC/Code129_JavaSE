package com.itheima.demo30_Exchanger等待超时;

import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @author jialefei
 * @date 2022/4/25 16:06
 */
public class BoyThread extends Thread {
    private Exchanger<String> e;

    public BoyThread(Exchanger<String> e,String name) {
        super(name);
        this.e = e;
    }

    @Override
    public void run() {
        try {
            String result = e.exchange(getName() + "说:我喜欢你,你喜不喜欢我...",3, TimeUnit.SECONDS);
            System.out.println("女孩回馈说:"+result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
