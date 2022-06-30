package com.itheima.demo2_枚举定义格式;

public enum Season {
    //枚举值
    chun("春天"), xia("夏天"), qiu("秋天"), dong("冬天");
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
