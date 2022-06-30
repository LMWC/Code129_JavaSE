package com.itheima.demo7_Base64编解码;

import java.util.Base64;

public class Test2 {
    public static void main(String[] args) {
        //1.准备数据
        String s = "黑马程序员abcdef";
        for (int i = 0; i < 100; i++) {
            s += i;
        }
        //2.获取编码对象
        Base64.Encoder encoder = Base64.getUrlEncoder();

        //3.编码操作
        String enStr = encoder.encodeToString(s.getBytes());
        System.out.println("编码后:"+enStr);

        //4.获取解码对象
        Base64.Decoder decoder = Base64.getUrlDecoder();

        //5.解码操作
        byte[] bys = decoder.decode(enStr);

        //6.将解码后的内容，转换成字符串
        System.out.println("解码后:"+new String(bys));
    }
}
