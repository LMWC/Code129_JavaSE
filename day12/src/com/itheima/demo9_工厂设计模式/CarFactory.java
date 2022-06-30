package com.itheima.demo9_工厂设计模式;

public class CarFactory {

    public static Car getCar() {
        if (Location.weizhi.equals("上海")) {
            return new FLL("a", "a", "a", "a", "a", "a", "a", "a");
        } else if (Location.weizhi.equals("深圳")) {
            return new BSJ("b", "b", "b", "b", "b", "b", "b", "b");
        } else {
            return null;
        }
    }
}
