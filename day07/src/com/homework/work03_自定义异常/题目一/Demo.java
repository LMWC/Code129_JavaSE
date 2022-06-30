package com.homework.work03_自定义异常.题目一;

public class Demo {
    public static void main(String[] args) {
        Student student = new Student();
        try{
            student.setAge(100);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
