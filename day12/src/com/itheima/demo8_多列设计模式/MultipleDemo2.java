package com.itheima.demo8_多列设计模式;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//特定对象
public class MultipleDemo2 {
    public static final MultipleDemo2 one = new MultipleDemo2();
    public static final MultipleDemo2 two = new MultipleDemo2();
    public static final MultipleDemo2 three = new MultipleDemo2();
    public static final MultipleDemo2 four = new MultipleDemo2();
    public static final MultipleDemo2 five = new MultipleDemo2();

    private MultipleDemo2() {
    }
}
