package com.homework.work06_BigDecimal类.题目二;

/**
 * 学生
 */
public class Student {

    //成员变量
    private String name;    //姓名
    private String gender;  //性别
    private int age;        //年龄
    private double score;   //分数

    //空参
    public Student() {
    }

    //全参构造
    public Student(String name, String gender, int age, double score) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.score = score;
    }

    //getter & setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
