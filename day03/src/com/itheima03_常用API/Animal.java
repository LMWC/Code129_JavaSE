package com.itheima03_常用API;

public class Animal {
    String name;
    int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    ////需求:希望，如果两个对象的姓名和年龄相同，我就认为他们两个是同一个。
    ////重写equals
    //@Override
    //public boolean equals(Object o) {//this    o
    //    //比较地址值，如果相同，返回true
    //    if (this==o){
    //        return true;
    //    }
    //    //如果o为null或者两个对象的类型不一样 返回false
    //    if (o==null ||  this.getClass()!=o.getClass()){
    //        return false;
    //    }
    //    //向下转型:因为父类的引用不能调用子类的特有内容(name,age)
    //    Animal a = (Animal) o;
    //    //比较内容
    //    //boolean b = this.name.equals(a.name) && this.age == a.age;
    //    //boolean b =Objects.equals(this.name,a.name)&& this.age == a.age;
    //    boolean b=(this.name==a.name || this.name!=null&& this.name.equals(a.name))&& this.age == a.age;
    //    return b;
    //}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (age != animal.age) return false;
        return name != null ? name.equals(animal.name) : animal.name == null;
    }
}
