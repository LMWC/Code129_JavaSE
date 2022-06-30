package com.itheima.demo8_序列化读写数据;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //序列化流
        //构造方法：public ObjectOutputStream(OutputStream out) ： 创建一个指定序列化流对象，需要传入一个字节输出流对象。
        //常用方法：public final void writeObject (Object obj) : 将指定的对象以字节方式写出到指定文件中。
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day11\\resouce\\demo8\\student.txt"));
        Student s = new Student();
        s.name = "张三";
        s.age = 18;
        oos.writeObject(s);
        oos.close();


        //反序列化流
        //构造方法：public ObjectInputStream(InputStream in) ： 创建一个指定反序列化流对象，需要传入一个字节输入流对象。
        //常用方法：public final Object readObject () : 从指定的路径，读取一个对象的字节数据，并返回该对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day11\\resouce\\demo8\\student.txt"));
        Object o = ois.readObject();
        Student s2 = (Student) o;
        System.out.println("s2:"+s2);
        ois.close();
    }
}
