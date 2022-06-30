package com.homework.work02_Map接口.题目一;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        //	定义一个：键Integer，值String类型的HashMap集合
        HashMap<Integer,String> map = new HashMap<>();
        //	存储以下数据：
        //1，”张三”
        //2，“李四”
        //1，“王五”
        map.put(1, "张三");
        map.put(2, "李四");
        map.put(1, "王五");
        //打印集合大小；
        System.out.println(map.size());
        //使用“键找值”的方式遍历集合，打印键和值；
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            String value = map.get(key);
            System.out.println(key+"="+value);
        }

        //使用“键值对”的方式遍历集合，打印键和值；
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }

        //获取键为1的值，并打印
        System.out.println(map.get(1));

        //获取键为10的值，并打印
        System.out.println(map.get(10));

        //判断集合中是否有键：10
        System.out.println(map.containsKey(10));

        //删除键为1的键值对，删除完毕打印集合
        map.remove(1);
        System.out.println(map);
    }
}
