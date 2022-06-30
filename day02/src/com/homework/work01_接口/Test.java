package com.homework.work01_接口;

public class Test {
    public static void main(String[] args) {
        JavaTeacher javaTeacher = new JavaTeacher("1","1","1");
        UITeacher uiTeacher = new UITeacher("2","2","2");

        System.out.println(javaTeacher.getName());
        javaTeacher.work();
        System.out.println("----------");
        System.out.println(uiTeacher.getName());
        uiTeacher.work();
        uiTeacher.paint();
    }
}
