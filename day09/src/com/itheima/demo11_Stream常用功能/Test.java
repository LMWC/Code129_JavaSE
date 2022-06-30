package com.itheima.demo11_Stream常用功能;

import java.util.stream.Stream;

/**
 * @author jialefei
 * @date 2022/4/26 11:40
 */
public class Test {
    public static void main(String[] args) {
        //终结方法:返回值类型不再是Stream接口的方法，不支持链式调用。

        //统计个数	long	count()返回流中的元素个数。
        Stream<String> s1 = Stream.of("a", "b", "c");
        System.out.println("count：" + s1.count());

        //逐一处理	void	forEach(Consumer<?superT>action)对此流的每个元素进行操作
        Stream<String> s2 = Stream.of("a", "b", "c");
        s2.forEach((String s) -> {
            System.out.println("forEach:" + s);
        });


        //非终结方法(函数拼接方法):返回值类型仍然是Stream接口的方法，支持链式调用。
        //过滤	Stream<T> filter(Predicate<?superT>predicate)返回经过筛选，满足的条件的元素组成的流
        Stream<String> s3 = Stream.of("a", "b", "c");
        s3.filter((String s) -> {
            return s.equals("a");
        }).forEach((String s) -> {
            System.out.println("filter:" + s);
        });

        //取前n个	Stream<T> limit(longmaxSize)返回由此流(包含)第maxSize个之前的元素组成的流
        Stream<String> s4 = Stream.of("a", "b", "c");
        s4.limit(2).forEach((String s) -> {
            System.out.println("limit:" + s);
        });

        //跳过前n个	Stream<T> skip(longn)返回由此流(不含)第n个之后元素组成的流
        Stream<String> s5 = Stream.of("a", "b", "c");
        s5.skip(2).forEach((String s) -> {
            System.out.println("skip:" + s);
        });

        //映射	<R>Stream<R> map(Function<?superT,?extendsR>mapper) 返回流中旧元素经指定规则转换后的心元素组成的流
        Stream<String> s6 = Stream.of("a", "b", "c");
        s6.map((String s)->{return "字符串-"+s;}).forEach((String s) -> {
            System.out.println("map:" + s);
        });

        //组合	static<T>Stream<T>  concat(Stream<?extendsT>a,Stream<?extendsT>b) 返回将两个流中的元素合并到一其组成的流
        Stream<String> s7 = Stream.of("a", "b", "c");
        Stream<String> s8 = Stream.of("d", "e", "f");
        Stream<String> concatStream = Stream.concat(s7, s8);
        concatStream.forEach((String s) -> {
            System.out.println("concat:" + s);
        });
    }
}
