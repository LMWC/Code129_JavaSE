package com.homework.work03_Set接口.题目二;

import java.util.Collections;
import java.util.HashSet;

public class Demo {
    public static void main(String[] args) {
        //	定义一个存储Student类型的HashSet集合
        HashSet<Student> set = new HashSet<>();
        // 创建以下三个Student对象
        Student s1 = new Student("张三","男",20);
        Student s2 = new Student("李四","女",21);
        Student s3 = new Student("张三","男",20);

        //	将上述三个对象存储到Set集合中
        Collections.addAll(set,s1,s2,s3);


        //	使用增强for遍历集合，获取每个Student对象，并打印属性值；
        //	请实现集合中不能存储姓名年龄相同的元素
        //未重写Student类的equals()和hashCode()方法张三有2个,通过idea重写即可
        for (Student student : set) {
            System.out.println(student.getName()+","+student.getSex()+","+student.getAge());
        }
    }
}
