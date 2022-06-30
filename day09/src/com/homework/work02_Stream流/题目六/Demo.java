package com.homework.work02_Stream流.题目六;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*<R> Stream<R> map(Function<? super T, ? extends R> mapper);
        收集到集合中
        Stream流提供collect方法，其参数需要一个java.util.stream.Collector<T,A, R>接口对象来指定收集到哪种集合中。幸运的是，java.util.stream.Collectors类提供一些方法，可以作为Collector接口的实例：
        - public static <T> Collector<T, ?, List<T>> toList()：转换为List集合。
        - public static <T> Collector<T, ?, Set<T>> toSet()：转换为Set集合。
        收集到数组:
        Object[] toArray();*/

public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(
                Arrays.asList("王佳乐", "张三丰", "王思聪", "张飞"));

        List<Person> personList = list.stream()
                .map(s -> new Person(s)) // 映射字符串至person对象
                .collect(Collectors.toList()); // 提取为 List
        for (Person person : personList) {
            System.out.println(person.getName());
        }
    }
}
class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
