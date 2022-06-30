package com.itheima.demo1_枚举入门;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //键盘录入红绿灯
        //Scanner sc = new Scanner(System.in);
        //System.out.println("请输入红绿灯的状态");
        //String light = sc.nextLine();
        //
        //switch (light) {
        //    case "红":
        //        System.out.println("红灯停");
        //        break;
        //    case "黄":
        //        System.out.println("黄灯亮了等一等");
        //        break;
        //    case "绿":
        //        System.out.println("绿灯行");
        //        break;
        //    default:
        //        System.out.println("异常");
        //}

        Light light = Light.YELLOW;

        switch (light) {
            case RED:
                System.out.println("红灯停");
                break;
            case YELLOW:
                System.out.println("黄灯亮了等一等");
                break;
            case GREEN:
                System.out.println("绿灯行");
                break;
            default:
                System.out.println("异常");
        }
    }
}
