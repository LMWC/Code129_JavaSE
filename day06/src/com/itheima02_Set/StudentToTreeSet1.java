package com.itheima02_Set;

public class StudentToTreeSet1 implements Comparable<StudentToTreeSet1> {
    String name;
    int age;

    public StudentToTreeSet1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentToTreeSet1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(StudentToTreeSet1 s) { //this 代表调用这个方法的对象
        //证明：this代表后面正在添加的元素，s代表前面已添加的元素
        //System.out.println("s:" + s + ",this:" + this);

        //this表示后面的数，s表示前面数
        //this  vs s  升序
        //结果: 负数  this放到s的前面
        //结果:  0   新元素不添加
        //结果: 正数  this放到s的后面
        //降序 -(this  vs s)

        //注意:类中可能会有多个元素，需要明确优先按照谁的顺序比较，优先按谁，谁教放到前面比。
        //需求:优先按照姓名的升序比较，如果姓名相同，再按照年龄的降序比较
        //①姓名升序
        int num = this.name.compareTo(s.name);
        //②如果姓名相同，按照年龄的降序比较
        num = num == 0 ? s.age - this.age : num;
        return num;
    }
}
