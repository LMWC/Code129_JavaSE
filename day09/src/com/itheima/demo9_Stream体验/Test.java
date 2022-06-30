package com.itheima.demo9_Stream体验;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author jialefei
 * @date 2022/4/26 11:05
 */
public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("迪丽热巴");
        list.add("宋远桥");
        list.add("苏星河");
        list.add("老子");
        list.add("庄子");
        list.add("黄晓明");
        list.add("孙子");
        list.add("洪七公");
        //需求
        //1. 队伍中只要名字为3个字的成员姓名；
        //2. 队伍中筛选之后只要前3个人；

        //方式1:
        List<String> listOne = new ArrayList<>();
        //遍历集合
        for (String name : list) {
            if (name.length()==3){
                listOne.add(name);
            }
        }
        List<String> listTwo = new ArrayList<>();
        //遍历listOne集合
        for (int i = 0; i < listOne.size(); i++) {
            if (i<3){
                listTwo.add(listOne.get(i));
            }
        }
        //打印listTwo
        System.out.println(listTwo);

        //Strean流体验
        //Stream<String> s1 = list.stream();
        //Stream<String> s2 = s1.filter((String s) -> {
        //    return s.length() == 3;
        //});
        //Stream<String> s3 = s2.limit(3);
        ////打印结果
        //s3.forEach((String s)->{
        //    System.out.println(s);
        //});
        //链式编程
        list.stream().filter(s->s.length() == 3).limit(3).forEach(s-> System.out.println(s));
    }
}
