package com.homework.work08_包装类.题目二;

/**
 * 学生
 */
public class Student {

    //成员变量
    private String name;    //姓名
    private int age;        //年龄
    private double height;  //身高
    private boolean flag;   //婚否
    private char gender;    //性别

    //空参构造
    public Student() {
    }

    //全参构造
    public Student(String name, int age, double height, boolean flag, char gender) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.flag = flag;
        this.gender = gender;
    }

    //toString
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", flag=" + flag +
                ", gender=" + gender +
                '}';
    }

    //getter & setter

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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
