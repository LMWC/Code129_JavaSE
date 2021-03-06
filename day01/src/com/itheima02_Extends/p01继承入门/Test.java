package com.itheima02_Extends.p01继承入门;

/*
继承概述
    1.继承的理解
    	父类中具备子类对象共有的属性和行为。
    	子类继承父类，使得子类及其对象可以直接具有父类属性和行为。
    	子类可以直接访问父类中的非私有的属性和行为
    	继承描述的是事物之间的所属关系，这种是一种:is-a 的关系。
    2.继承的好处
    	提高代码的复用性;
    	使类与类之间产生了关系(多态的前提);
编程入门
    1.编程中的继承
        向上抽取:根据子类的共同属性和行为抽取父类
        向下实现:先定义父类，再定义子类继承父类，子类拥有父类的属性和行为，子类可以不再定义,直接使用父类的。
    2.继承的格式
	    public  class 子类 extends 父类 {
		    ...
	    }
代码调整
    为了课后便于查看代码，可以将对象类与测试类放在同一个java文件中，但是实际开发一般不建议这样做。

需求:使用继承的形式，完成上述某猫类和狗类的定义
    猫
	    属性:姓名
	    行为:吃饭,叫，睡觉
    狗
	    属性:姓名
	    行为:吃饭,叫，睡觉
 */
public class Test {
    public static void main(String[] args) {
        //创建猫对象并使用
        Cat c = new Cat();
        System.out.println(c.name);
        c.name = "小花";
        System.out.println(c.name);
        c.eat();
        c.sleep();
        c.cry();
        System.out.println("-------");
        //创建狗对象并使用
        Dog d = new Dog();
        System.out.println(d.name);
        d.name = "旺财";
        System.out.println(d.name);
        d.eat();
        d.sleep();
        d.cry();
    }
}
