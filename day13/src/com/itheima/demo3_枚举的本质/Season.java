package com.itheima.demo3_枚举的本质;

public final class Season /*extends Enum<Season>*/ {
    static{}

    //枚举值--成员变量
    //chun("春天"), xia("夏天"), qiu("秋天"), dong("冬天");
    public static final Season chun = new Season("春天");
    public static final Season xia = new Season("夏天");
    public static final Season qiu = new Season("秋天");
    public static final Season dong = new Season("冬天");

    //成员遍历
    String name;

    //构造方法
    //Season(){};//隐含了private
    private Season(String name) {
        this.name = name;
    }

    //成员方法
    public void show() {
        System.out.println(name);
    }
}