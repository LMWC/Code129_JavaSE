package com.itheima.demo2_属性集集合功能;

import java.util.Properties;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        //public Properties() :创建一个空的属性列表
        Properties p = new Properties();

        //public Object setProperty(String key,String value): 保存一对属性。
        p.setProperty("姓名", "张三");
        p.setProperty("年龄", "18");

        //public String getProperty(String key) :使用此属性列表中指定的键搜索属性值。
        System.out.println(p.getProperty("姓名"));
        System.out.println(p.getProperty("年龄"));

        //public Set<String> stringPropertyNames() :所有键的名称的集合。
        Set<String> keys = p.stringPropertyNames();
        for (String key : keys) {
            String value = p.getProperty(key);
            System.out.println(key + "===" + value);
        }

    }
}
