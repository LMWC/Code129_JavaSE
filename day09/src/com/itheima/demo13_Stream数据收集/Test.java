package com.itheima.demo13_Stream数据收集;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author jialefei
 * @date 2022/4/26 12:11
 */
public class Test {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("a", "b", "c");
        //收集到数组中，具备终结性, 不支持链式调用。
        //Object[]  toArray()：转换为Object数组
        Object[] arr = stream.toArray();
        System.out.println(Arrays.toString(arr));
        //收集到集合中,具备终结性, 不支持链式调用。
        //R    collect(Collector<T,A,R>coll)：转换为指定的集合，R代表最终转为的集合的具体类型
        //java.util.stream.Collectors类提供一些方法，可以作为Collector接口的实例。
        //public static <T> Collector<T, ?, List<T>>  toList()：转换为List集合。
        //public static <T> Collector<T, ?, Set<T>> toSet()：转换为Set集合。


        //收集到List集合
        Stream<String> stream2 = Stream.of("a", "b", "c");
        List<String> list = stream2.collect(Collectors.toList());
        System.out.println(list);
        //收集到Set集合
        Stream<String> stream3 = Stream.of("a", "b", "c");
        Set<String> set = stream3.collect(Collectors.toSet());
        System.out.println(set);
    }
}
