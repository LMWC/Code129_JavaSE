package com.itheima.demo9_序列化注意事项;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Du {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //如果某成员变量不想序列化，须注明瞬态transient关键字修饰，被修饰的成员变量不会被转为字节序列。
        //反序列化时，如果找不到class文件(class文件丢失或位置改变),抛出ClassNotFoundException异常。
        //解决办法:避免移动，或移动后重新序列化。
        //反序列化时，如果class有父类，父类未序列化且没提供无参构造(序列化可以不提供),抛出InvalidClassException异常。
        //解决办法:要序列化类的父类要么序列号要么保留无参构造方法。
        //反序列化时，如果序列化后class文件版本号改变(默认类的内容,改变版本号随之改变),抛出InvalidClassException异常。
        //解决办法:重新序列化 或  固定类中序列化的版本号常量serialVersionUID的值;
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day11\\resouce\\demo9\\zi.txt"));
        Object o = ois.readObject();
        Zi zi2 = (Zi) o;
        System.out.println(zi2);
    }
}
