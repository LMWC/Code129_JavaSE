package com.homework.work04_缓冲流.题目二;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) throws IOException {
        //定义集合
        List<String> list = new ArrayList<>();
        //添加元素
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("周杰伦");
        list.add("蔡徐坤");

        //定义字符缓冲输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("day17/files/test3_2.txt"));

        //写入文件
        for (String name : list) {
            bw.write(name);
            bw.newLine();//换行
        }

        //释放资源
        bw.close();
    }
}
