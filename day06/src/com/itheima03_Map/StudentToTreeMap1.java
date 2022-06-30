package com.itheima03_Map;

public class StudentToTreeMap1 implements Comparable<StudentToTreeMap1> {
    String name;
    int age;

    public StudentToTreeMap1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentToTreeMap1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(StudentToTreeMap1 s) {
        //注意:类中可能会有多个元素，需要明确优先按照谁的顺序比较，优先按谁，谁教放到前面比。
        //需求:优先按照姓名的升序比较，如果姓名相同，再按照年龄的降序比较
        //①姓名升序
        int num = this.name.compareTo(s.name);
        //②如果姓名相同，按照年龄的降序比较
        num = num == 0 ? s.age - this.age : num;
        return num;
    }
}
