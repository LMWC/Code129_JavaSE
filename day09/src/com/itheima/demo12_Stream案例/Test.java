package com.itheima.demo12_Stream案例;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author jialefei
 * @date 2022/4/26 11:56
 */
public class Test {
    public static void main(String[] args) {
        //定义两个ArrayList集合，存储两组姓名，根据如下要求，刷选最终数据。
        List<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("老子");
        one.add("庄子");
        one.add("孙子");
        one.add("洪七公");
        List<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("张三丰");
        two.add("赵丽颖");
        two.add("张二狗");
        two.add("张天爱");
        two.add("张三");

        //1.处理第一队数据
        Stream<String> s11 = one.stream();
        //1.1第一个队伍只要名字为3个字的成员姓名；
        Stream<String> s12 = s11.filter((String s) -> {
            return s.length() == 3;
        });
        //1.2第一个队伍筛选之后只要前2个人；
        Stream<String> s13 = s12.limit(2);
        //2.处理第2队数据
        Stream<String> s21 = two.stream();
        //2.1第二个队伍只要姓张的成员姓名；
        Stream<String> s22 = s21.filter((String s) -> {
            return s.startsWith("张");
        });
        //2.2第二个队伍筛选之后不要前2个人；
        Stream<String> s23 = s22.skip(2);

        //3. 将筛选后的两个队伍合并为一个队伍；
        Stream<String> allName = Stream.concat(s13, s23);
        //4.根据姓名创建Person对象并存储到集合；
        Stream<Person> personStream = allName.map((String s) -> {
            return new Person(s);
        });
        //5.打印整个队伍的Person对象信息。
        personStream.forEach((Person p) -> {
            System.out.println(p);
        });

        //链式编程
        Stream.concat(
                one.stream().filter(s -> s.length() == 3).limit(2),
                two.stream().filter(s -> s.startsWith("张")).skip(2)
        ).map(s -> new Person(s)).forEach(p -> System.out.println(p));

        //自己完成:将所有的Person对象收集到集合中
    }
}
