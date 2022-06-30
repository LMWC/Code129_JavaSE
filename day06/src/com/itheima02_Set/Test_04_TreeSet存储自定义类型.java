package com.itheima02_Set;

/*
1.概概述
	TreeSet集合是Set接口的一个实现类，底层依赖于TreeMap,是一种基于红黑树的实现
	TreeSet集合存储的对象必须拥有排序规则(比较器)，否则会报出异常。
2.特点：元素无索引,元素存取无序,元素不可重复(唯一)
3.使用方式
	自然排序:描述事物的类实现 java.lang.Comparable接口，重写compareTo(Object o)方法，使用TreeSet无参构造创建集合对象
	    this表示后添加的元素
	比较器排序：创建重写compare(E e1,E e2)方法的Comparator接口实现类对象，作为参数传入TreeSet的构造方法。
	    e1表示后添加的元素
 */

import java.util.Comparator;
import java.util.TreeSet;

public class Test_04_TreeSet存储自定义类型 {
    public static void main(String[] args) {
        //1.自然排序实现
        //method1();

        //2.比较器排序实现
        Comparator c = new Comparator<StudentToTreeSet2>() {
            @Override
            public int compare(StudentToTreeSet2 s1, StudentToTreeSet2 s2) {
                //证明了s1表示的是后面的数据，s2表示前面的数据
                //System.out.println("s1:"+s1+",s2:"+s2);

                //s1表示后面的数，s2表示前面数
                //s1  vs s2  升序
                //结果: 负数  s1放到s2的前面
                //结果:  0   顺序不变
                //结果: 正数  s1放到s2的后面
                //降序 -(s1  vs s2)

                //注意:类中可能会有多个元素，需要明确优先按照谁的顺序比较，优先按谁，谁教放到前面比。
                //需求:优先按照姓名的升序比较，如果姓名相同，再按照年龄的降序比较
                //①年龄升序
                int num = s1.name.compareTo(s2.name);
                //②如果姓名相同，按照年龄的降序比较
                num = (num == 0 ? s2.age - s1.age : num);
                return num;
            }
        };
        //创建集合对象
        TreeSet<StudentToTreeSet2> ts = new TreeSet<>(c);
        //创建学生对象
        StudentToTreeSet2 s1 = new StudentToTreeSet2("zhangsan", 18);
        StudentToTreeSet2 s2 = new StudentToTreeSet2("lisi", 20);
        StudentToTreeSet2 s3 = new StudentToTreeSet2("zhangsan", 20);
        StudentToTreeSet2 s4 = new StudentToTreeSet2("zhangsan", 18);
        //添加数据
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        //遍历数据
        for (StudentToTreeSet2 s : ts) {
            System.out.println(s);
        }
    }

    public static void method1() {
        //创建集合
        TreeSet<StudentToTreeSet1> ts = new TreeSet<>();
        //创建学生对象
        StudentToTreeSet1 s1 = new StudentToTreeSet1("zhangsan", 18);
        StudentToTreeSet1 s2 = new StudentToTreeSet1("lisi", 20);
        StudentToTreeSet1 s3 = new StudentToTreeSet1("zhangsan", 20);
        StudentToTreeSet1 s4 = new StudentToTreeSet1("zhangsan", 18);
        //添加数据
        //java.lang.ClassCastException : StudentToTreeSet1 cannot be cast to java.lang.Comparable
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        //遍历集合
        for (StudentToTreeSet1 s : ts) {
            System.out.println(s);
        }
    }
}
