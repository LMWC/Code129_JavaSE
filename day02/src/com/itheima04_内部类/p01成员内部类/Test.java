package com.itheima04_内部类.p01成员内部类;

/*
概述
1.概念:将类B定义在类A里面，类B就称为内部类，类A则称为类B的外部类。
2.分类:内部类分为，成员内部类、匿名内部类、局部内部类(自行了解)
3.编译:内部类是一个独立的类，编译后，有单独的class文件，命名为:外部类名+$+内部类类名标识

成员内部类
1.介绍
    定义在成员位置（类中方法外）的类称为成员内部类。
2.定义格式
	 public  class 外部类 {
        		public  class 内部类{
        		}
	}
3.使用格式
	外部类名.内部类名 对象名 = new 外部类型().new 内部类型();
4.成员内部类访问特点
    内部类可以直接访问外部类的成员，包括私有成员。
    外部类要访问内部类的成员，必须要建立内部类的对象。


示例:在人类内部，定义一个心脏类，演示成员内部类的使用。
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.num);

        Person.Heart h = p.new Heart();
        h.jump();
        System.out.println("过了一百年");
        p.setLive(false);
        h.jump();
    }
}
