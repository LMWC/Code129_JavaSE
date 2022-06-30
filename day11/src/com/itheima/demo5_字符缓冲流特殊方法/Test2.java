package com.itheima.demo5_字符缓冲流特殊方法;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test2 {
    public static void main(String[] args) throws IOException {
        //请将sort.txt文本信息恢复顺序。
        TreeMap<String, String> map = new TreeMap<>();
        BufferedWriter bw = new BufferedWriter(new FileWriter("day11\\resouce\\demo5\\sortResult.txt"));

        //1.读取文档中的数据(每次读一行)
        BufferedReader br = new BufferedReader(new FileReader("day11\\resouce\\demo5\\sort.txt"));
        String line = null;
        while ((line = br.readLine()) != null) {
            //2.将每一行的数据，拆成两部分（如果以点切割，需要将两个斜杠进行转义）
            String[] contents = line.split("\\.");
            //System.out.println(contents[0]+"=="+contents[1]);
            //3.将前面作为键，后面作为值存储到TreeMap(自动排序)
            map.put(contents[0], contents[1]);
        }
        //4.遍历TreeMap集合，获取每一个键值对
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            //System.out.println(key+"."+value);
            //5.将键值对重新拼成一行数据，
            String s = key + "." + value;
            //6.将拼好的数据写回到文件中。
            bw.write(s);
            bw.newLine();
        }

        //关流
        br.close();
        bw.close();


    }
}
