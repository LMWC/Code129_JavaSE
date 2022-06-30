package com.itheima.demo1_InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test {
    public static void main(String[] args) throws UnknownHostException {
        //创建对象
        //static InetAddress getLocalHost() ；获得本地主机IP地址对象
        //static InetAddress getByName(String host)；根据主机名获得对应的IP地址对象
        //常用方法
        //String getHostName()；根据InetAddress对象获得主机名
        //String getHostAddress()；根据InetAddress对象获得IP地址字符串

        InetAddress ip1 = InetAddress.getLocalHost();
        System.out.println(ip1.getHostName());
        System.out.println(ip1.getHostAddress());

        InetAddress ip2 = InetAddress.getByName("192.168.18.42");
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());



    }
}
