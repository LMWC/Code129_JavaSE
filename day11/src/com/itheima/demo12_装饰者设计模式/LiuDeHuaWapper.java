package com.itheima.demo12_装饰者设计模式;

public class LiuDeHuaWapper implements Star {
    private LiuDeHua ldh;

    public LiuDeHuaWapper(LiuDeHua ldh) {
        this.ldh = ldh;
    }

    @Override
    public void sing() {
        ldh.sing();
        System.out.println("换我一句不流泪...");
        ldh.dance();
    }

    @Override
    public void dance() {
        //不用增强
        ldh.dance();
    }
}
