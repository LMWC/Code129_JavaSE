package com.itheima.demo9_序列化注意事项;

import java.io.*;

public class Xie {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day11\\resouce\\demo9\\zi.txt"));
        Zi zi = new Zi(10);
        zi.age=18;
        zi.weight=300;
        oos.writeObject(zi);
        oos.close();


    }
}
