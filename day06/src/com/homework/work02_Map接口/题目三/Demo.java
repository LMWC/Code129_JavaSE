package com.homework.work02_Map接口.题目三;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeMap;

public class Demo {
    public static void main(String[] args) {
            //准备牌
            TreeMap<Integer,String> map = new TreeMap<>();

            String[] num = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
            String[] color={"♠","♣","♥","♦",};
            //定义计数器
            int count = 1;
            for (String s : num) {
                for (String c : color) {
                    //把52张牌放到集合中
                    map.put(count,c+s);
                    //每次让计数器累加
                    count++;
                }
            }
            //单独存放大王小王
            map.put(count,"小王");
            count++;
            map.put(count,"大王");

            //需要创建一个List集合,因为洗牌的时候工具类的方法只能对List进行操作
            ArrayList<Integer> list = new ArrayList<>();
            Set<Integer> set = map.keySet();
            //遍历set集合把每个元素移动到list中
            for (Integer i : set) {
                list.add(i);
            }


            //洗牌
            Collections.shuffle(list);

            //System.out.println("乱序之后" + list); //[40, 15, 30, 42, 21, 49, 34, 4, 29, 39, 32, 16, 12,

            //发牌
            //3个集合代表人   1个集合代表底牌
            ArrayList<Integer> list1 = new ArrayList<>();
            ArrayList<Integer> list2 = new ArrayList<>();
            ArrayList<Integer> list3 = new ArrayList<>();
            ArrayList<Integer> list4 = new ArrayList<>();

            //对list进行遍历把51张牌发出去  把最后的3张牌当做底牌
            //*******这里我们用到了索引********
            //*********区分开索引的牌**********
            for (int i = 0; i < list.size()-3; i++) {
                Integer pai = list.get(i);
                if( i % 3 == 0){
                    //把牌发给第一个人
                    list1.add(pai);
                }else if(i % 3 == 1){
                    //把牌发给第二个人
                    list2.add(pai);
                }else{
                    //把牌发给第三个人
                    list3.add(pai);
                }
            }
            //把最后的3张牌当做底牌
            list4.add(list.get(list.size()-1));
            list4.add(list.get(list.size()-2));
            list4.add(list.get(list.size()-3));


            //排序
            Collections.sort(list1);
            Collections.sort(list2);
            Collections.sort(list3);
            Collections.sort(list4);

            //看牌
            method("阿姨",list1,map);
            method("老卢",list2,map);
            method("柳岩",list3,map);
            method("底牌",list4,map);
        }


        //看牌
        public static void method(String name, ArrayList<Integer> list, TreeMap<Integer,String> map){
            System.out.print(name + "的牌是：");

            for (Integer key : list) {
                //根据键获取值
                String value = map.get(key);
                System.out.print(value + " ");
            }
            //换行
            System.out.println();

    }
}
