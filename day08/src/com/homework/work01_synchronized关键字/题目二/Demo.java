package com.homework.work01_synchronized关键字.题目二;

import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) throws InterruptedException {

        // 售票大厅对象
        TicketHall ticketHall = new TicketHall();

        // 将所有线程存入这个集合，后续统一管理
        ArrayList<Thread> ticketWindows = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Thread window = new Thread(ticketHall, "t" + i);
            ticketWindows.add(window);
            // 启动线程
            window.start();
        }

        // 等所有线程结束
        for (Thread window : ticketWindows) {
            window.join();
        }

        // 验证结果
        ticketHall.check();

    }
}
