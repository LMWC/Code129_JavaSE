package com.itheima03_Map;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
1.概述
	TreeMap集合是Map接口的一个实现类，底层依赖于TreeMap,是一种基于红黑树的实现
	TreeMap集合存储的对象作为键列,必须拥有排序规则(比较器)，否则会报出异常。
2.特点
	元素无索引,元素存取无序,元素不可重复(唯一)
3.使用方式
	自然排序:描述事物的类实现 java.lang.Comparable接口，重写compareTo方法，使用TreeMap无参构造创建集合对象
	比较器排序：创建重写compare方法的Comparator接口实现类对象，作为参数传入TreeMap的构造方法。

需求:将包含姓名和年龄的学生对象作为键, 家庭住址作为值，存储到 TreeMap集合中

 */
public class Test_06TreeMap键列存储自定义类型 {
    public static void main(String[] args) {
        //1.自然排序
        //method1();
        //2.比较器排序
        //创建比较器对象
        Comparator c = new Comparator<StudentToTreeMap2>() {

            @Override
            public int compare(StudentToTreeMap2 s1, StudentToTreeMap2 s2) {
                //注意:类中可能会有多个元素，需要明确优先按照谁的顺序比较，优先按谁，谁教放到前面比。
                //需求:优先按照姓名的升序比较，如果姓名相同，再按照年龄的降序比较
                //①姓名升序
                int num = s1.name.compareTo(s2.name);
                //②如果姓名相同，按照年龄的降序比较
                num = (num == 0 ? s2.age - s1.age : num);
                return num;
            }
        };
        //创建集合对象，并传入比较器对象
        TreeMap<StudentToTreeMap2, String> ts = new TreeMap<>(c);
        //创建学生对象
        StudentToTreeMap2 s1 = new StudentToTreeMap2("zhangsan", 18);
        StudentToTreeMap2 s2 = new StudentToTreeMap2("lisi", 20);
        StudentToTreeMap2 s3 = new StudentToTreeMap2("zhangsan", 20);
        StudentToTreeMap2 s4 = new StudentToTreeMap2("zhangsan", 18);
        //添加数据
        ts.put(s1, "北京");
        ts.put(s2, "上海");
        ts.put(s3, "广州");
        ts.put(s4, "深圳");
        //遍历集合
        Set<StudentToTreeMap2> keys = ts.keySet();
        for (StudentToTreeMap2 key : keys) {
            String value = ts.get(key);
            System.out.println(key + "===" + value);
        }
    }

    public static void method1() {
        //创建集合对象
        TreeMap<StudentToTreeMap1, String> ts = new TreeMap<>();
        //创建学生对象
        StudentToTreeMap1 s1 = new StudentToTreeMap1("zhangsan", 18);
        StudentToTreeMap1 s2 = new StudentToTreeMap1("lisi", 20);
        StudentToTreeMap1 s3 = new StudentToTreeMap1("zhangsan", 20);
        StudentToTreeMap1 s4 = new StudentToTreeMap1("zhangsan", 18);
        //添加数据
        ts.put(s1, "北京");//java.lang.ClassCastException:  StudentToTreeMap1 cannot be cast to java.lang.Comparable
        ts.put(s2, "上海");
        ts.put(s3, "广州");
        ts.put(s4, "深圳");
        //遍历集合数据
        Set<Map.Entry<StudentToTreeMap1, String>> entries = ts.entrySet();
        for (Map.Entry<StudentToTreeMap1, String> entry : entries) {
            StudentToTreeMap1 key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "===" + value);
        }
    }
}
