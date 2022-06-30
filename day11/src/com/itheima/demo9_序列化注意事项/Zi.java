package com.itheima.demo9_序列化注意事项;

import java.io.Serializable;

public class Zi extends Fu implements Serializable {
    static final long serialVersionUID = 1L;
    int age;
    transient int weight;
    int aaa;
    public Zi(int num) {
        super(num);
    }

    @Override
    public String toString() {
        return "Zi{" +
                "age=" + age +
                ", weight=" + weight +
                '}';
    }
}
