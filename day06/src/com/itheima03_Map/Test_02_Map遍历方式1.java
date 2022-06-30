package com.itheima03_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
1.概述
	通过元素中的键，获取键所对应的值。
2.步骤
	取Map中所有的键集，返回一个Set集合存储所有的键。方法提示:keyset()
	遍历键的Set集合，得到每一个键。
	根据键，获取键所对应的值。方法提示:get(K key)

需求:演示通过键找值的方式实现Map集合遍历

 */
public class Test_02_Map遍历方式1 {
    public static void main(String[] args) {
        //创建集合
        Map<String, String> map = new HashMap<>();
        //添加数据
        map.put("张三", "张三的媳妇");
        map.put("李四", "李四的媳妇");
        map.put("王五", "王五的媳妇");
        //遍历
        //获取所有的键
        Set<String> keys = map.keySet();
        //遍历所有的键
        for (String key : keys) {
            //通过键获取对应的值
            String value = map.get(key);
            //打印键值对
            System.out.println(key + "," + value);
        }
    }
}
