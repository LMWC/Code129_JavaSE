package com.itheima.demo2_枚举定义格式;

public class Test {
    public static void main(String[] args) {
        //枚举的构造方法被私有修饰的，不能在别的类创建枚举的对象
        //new Season("春天");

        Season s1 = Season.chun;
        s1.show();

        Season.xia.show();
        Season.qiu.show();
        Season.dong.show();
    }
}
