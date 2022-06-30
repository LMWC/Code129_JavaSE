package com.homework.work05_转换流.题目一;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Demo {

    public static void main(String[] args) throws IOException {
        //定义输出转换流
        OutputStreamWriter osw = new OutputStreamWriter(
                new FileOutputStream("day17/files/test4_1.txt"), "GBK");

        //输出内容
        osw.write("我要学好Java，我要月薪过万！！");

        //释放资源
        osw.close();
    }
}
