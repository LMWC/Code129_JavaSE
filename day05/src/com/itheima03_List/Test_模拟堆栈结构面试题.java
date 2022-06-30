package com.itheima03_List;

import java.util.LinkedList;

public class Test_模拟堆栈结构面试题 {

}


//模拟堆栈(先进后出)     addFirst()  removeFirst();
//模拟队列(先进先出)     addFirst()  removeLast();
class MyList<E> {
    private LinkedList<E> list = new LinkedList<>();


    public void add(E e) {
        list.addFirst(e);
    }


    public E get() {
        return list.removeFirst();
    }
}