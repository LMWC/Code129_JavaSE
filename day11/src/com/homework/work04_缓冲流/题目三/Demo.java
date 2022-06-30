package com.homework.work04_缓冲流.题目三;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo {


    public static void main(String[] args) throws IOException {
        //定义字符缓冲输入流
        BufferedReader br = new BufferedReader(new FileReader("day17/files/test3_2.txt"));

        //定义集合
        List<String> list = new ArrayList<>();

        //循环读取，每次读取一行
        String line;
        while ((line = br.readLine()) != null) {
            list.add(line);
        }

        //打印结果
        System.out.println(list);

        //释放资源
        br.close();
    }
}
