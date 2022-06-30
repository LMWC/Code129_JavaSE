package com.homework.work01_Collection集合_迭代器;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        //1.使用多态创建Collection集合
        Collection<String> col = new ArrayList<>();
        //2.添加元素
        col.add("JavaEE企业级开发指南");
        col.add("Oracle高级编程");
        col.add("MySQL从入门到精通");
        col.add("Java架构师之路");

        //3.使用迭代器遍历所有元素，并打印
        System.out.println("————————————————————使用迭代器遍历所有元素，并打印——————————————————————");
        Iterator<String> iterator = col.iterator();
        while(iterator.hasNext()) {
            String book = iterator.next();
            System.out.println(book);
        }

        //4.使用迭代器遍历所有元素，筛选书名小于10个字符的，并打印；
        //注意要重新获取新的迭代器,旧的无法再次使用
        System.out.println("—————————————————————用迭代器遍历所有元素，筛选书名小于10个字符的，并打印—————————————————————");
        iterator = col.iterator();
        while(iterator.hasNext()) {
            String book = iterator.next();
            if(book.length()<10) {//判断书名小于10个字符
                System.out.println(book);
            }
        }

        //5.使用迭代器遍历所有元素，筛选书名中包含“Java”的，并打印
        System.out.println("—————————————————————使用迭代器遍历所有元素，筛选书名中包含“Java”的，并打印—————————————————————");
        iterator = col.iterator();
        while(iterator.hasNext()) {
            String book = iterator.next();
            if(book.contains("Java")) {//判断书名是否包含Java字符
                System.out.println(book);
            }
        }


        //6.如果书名中包含“Oracle”，则删掉此书。删掉后，遍历集合，打印所有书名。
        //题目要求要遍历两次,但是一次遍历其实也可以完成
        System.out.println("—————————————————————如果书名中包含“Oracle”，则删掉此书。删掉后，遍历集合，打印所有书名。—————————————————————");
        iterator = col.iterator();
        while(iterator.hasNext()) {
            String book = iterator.next();
            if(book.contains("Oracle")) {//判断书名是否包含Oracle字符
                //注意此处不要使用col.remove(book); 会有异常的风险，而应该使用迭代器的remove()方法
                iterator.remove();
            } else {
                System.out.println(book);
            }
        }
    }
}
