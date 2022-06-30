package com.itheima01_复习;
//快捷键:(Fn)+Alt+insert
//步骤:1.先手动的定义所有的成员变量  2.alt+insert-->constructor  3.alt+insert-->get/set
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //行为:成员方法
    public void study() {
        System.out.println("好好学习，天天向上");
    }


    //内部类：类中类
    class Inter {

    }

    //代码块:一堆大括号
    {
    }
}
