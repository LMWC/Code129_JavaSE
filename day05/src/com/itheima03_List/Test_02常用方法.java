package com.itheima03_List;

import java.util.ArrayList;
import java.util.List;

/*

常用方法
	public void add(int index, E element): 将指定的元素，添加到该集合中的指定位置上
	public E get(int index):返回集合中指定位置的元素
	public E remove(int index): 移除列表中指定位置的元素, 返回的是被移除的元素
	public E set(int index, E element):用指定元素替换集合中指定位置的元素,返回修改前的元素

需求:通过ArrayList类演示常用方法

 */
public class Test_02常用方法 {
    public static void main(String[] args) {
        //创建集合
        List<String> list = new ArrayList<>();
        //添加数据
        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println(list);

        //public void add(int index, E element): 将指定的元素，添加到该集合中的指定位置上
        list.add(1, "a");
        System.out.println("add-index:" + list);

        //public E get(int index):返回集合中指定位置的元素
        //System.out.println("get:"+list.get(0));
        //System.out.println("get:"+list.get(1));
        //System.out.println("get:"+list.get(2));
        //System.out.println("get:"+list.get(3));
        for (int i = 0; i < 4; i++) {
            System.out.println("get:"+list.get(i));
        }

        //public E remove(int index): 移除列表中指定位置的元素, 返回的是被移除的元素
        //System.out.println("remove-index:"+list.remove(1));
        list.remove(1);
        System.out.println("remove-index:" + list);

        //public E set(int index, E element):用指定元素替换集合中指定位置的元素,返回修改前的元素
        //System.out.println("set-index:"+list.set(2,"赵六"));
        list.set(2,"赵六");
        System.out.println("set-index:"+list);
    }
}
