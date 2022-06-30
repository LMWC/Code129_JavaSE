package com.itheima.demo31_Exchanger交换数据;

import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;

/**
 * @author jialefei
 * @date 2022/4/25 16:06
 */
public class GirlThread extends Thread {
    private Exchanger<String> e;

    public GirlThread(Exchanger<String> e, String name) {
        super(name);
        this.e = e;
    }

    @Override
    public void run() {
        try {
            String result = e.exchange(getName() + "说:你是个好人...",3, TimeUnit.SECONDS);
            System.out.println("男孩的消息:"+result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
