package com.itheima.demo10_Stream对象获取;

import java.util.*;
import java.util.stream.Stream;

/**
 * @author jialefei
 * @date 2022/4/26 11:19
 */
public class Test {
    public static void main(String[] args) {
        //获取单列集合Stream对象
        Collection<Integer> c  =new ArrayList();
        Stream<Integer> stream = c.stream();

        //双列集合Stream对象
        Map<Integer,Integer> map = new HashMap<>();
        //获取键列的流对象
        Set<Integer> set = map.keySet();
        Stream<Integer> stream1 = set.stream();
        //获取值列的流对象
        Collection<Integer> c2 = map.values();
        Stream<Integer> stream2 = c2.stream();

        //获取数组Stream对象
        int[] arr = {1,2,3};
        //of(T t)
        Stream<int[]> stream3 = Stream.of(arr);//流里面有1个数据
        //of(T...t)
        Stream<Integer> stream4 = Stream.of(1, 2, 3);//流里面有3个数据
    }
}
