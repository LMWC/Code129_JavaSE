package com.itheima01_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
1.概述
	public interface Comparator<T>  定义比较对象规则的接口。
2.常用方法
	Comparator接口中提供了方法，如下
	public int compare(T  o1,T  o2) 比较用来排序的两个参数
	    o1表示后面的元素，o2表示前面的元素
3.应用场景
	用于Collections类的(自定义)排序功能，如下
	<T> void sort(List<T> list，Comparator<? super T> ):将集合中元素按照指定规则排序。

需求:演示Comparator在集合工具类排序功能中的使用

 */
public class Test_02比较器排序 {
    public static void main(String[] args) {
        //创建集合
        List<Integer> list = new ArrayList<>();
        //添加数据
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //获取一个Comparetor实现类对象:匿名内部类
        Comparator c = new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                //证明谁表示前面的元素，谁表示后面的元素
                //System.out.println("o1:"+o1+",o2:"+o2);
                //o1表示后面的数，o2表示前面数
                //o1  vs o2  升序
                //结果: 负数  o1放到o2的前面
                //结果:  0   顺序不变
                //结果: 正数  o1放到o2的后面
                //降序 -(o1  vs o2)

                //升序:
                //return o1-o2;
                //降序
                return o2-o1;//-(o1-o2);
            }
        };
        //调用含有比较器的排序功能
        Collections.sort(list,c);

        System.out.println("排序后:"+list);
    }
}
