package com.itheima03_Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/*
需求:
    按照斗地主规则，完成造牌-洗牌-发牌-看牌的动作，要求按照牌面大小看牌。
    牌面展示规则：【大王,小王,♠2,♥2,♣2,♦2,♠A,♥A,♣A,♦A....】
分析:
    准备牌:见图。
    洗牌--发牌--看牌：使用牌号操作

步骤:
    1.造牌
    	将牌盒设计为一个HashMap<Integer，String>集合
    	将牌号作为键，制作的牌面作为值，按照映射关系，放进牌盒
    	使用一个ArrayList集合记录所有牌号
    2.洗牌
    使	用Collections类的shuffle方法对牌号进行打乱
    3.发牌
    	为每个玩家和底牌各分配一个ArrayList<Integer>记录牌号。
    	遍历牌号，通过对3取模，将牌号分配给各玩家
    	遍历中，留3张牌号，存放于底牌集合中
    4.看牌
    	对玩家和底牌牌号排序
    	遍历玩家和底牌牌号，通过获取的牌号展示牌面

 */
public class Test_08斗地主升级版 {
    public static void main(String[] args) {
        /*
        造牌
         */
        //牌盒
        HashMap<Integer, String> pokerBox = new HashMap<>();
        //牌号集合
        ArrayList<Integer> pokerNums = new ArrayList<>();
        //造牌并将牌盒牌号添加到牌盒中
        int index = 54;
        //添加大王
        pokerNums.add(index);
        pokerBox.put(index--, "大王");

        //添加小王
        pokerNums.add(index);
        pokerBox.put(index--, "小王");

        //花色数组
        String[] colors = "♠,♥,♣,♦".split(",");
        //System.out.println(Arrays.toString(colors));
        //牌面值的数组
        String[] nums = "2,A,K,Q,J,10,9,8,7,6,5,4,3".split(",");
        //通过循环嵌套组合出所有的牌，并将牌放入到牌盒(将牌面值作为外循环)
        for (String num : nums) {
            for (String color : colors) {
                //组合出牌
                String poker = color + num;
                //将牌放入到牌盒
                pokerNums.add(index);
                pokerBox.put(index--, poker);
            }
        }
        //System.out.println(pokerBox);
        /*
        2.洗牌(号)
         */
        //System.out.println("打乱前:"+pokerNums);
        Collections.shuffle(pokerNums);
        //System.out.println("打乱后:"+pokerNums);
        /*
        3.发牌(号)
         */
        //创建三个玩家和底牌集合
        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();
        //遍历牌号，将牌盒分发给三个玩家和底牌
        for (int i = 0; i < pokerNums.size(); i++) {//i:0~53  牌号内容:54~1
            //获取每一张牌号
            Integer pokerNum = pokerNums.get(i);
            //判断是否是最后3张
            if (i >= 51) {
                diPai.add(pokerNum);
            } else {
                //分发给3个玩家
                if (i % 3 == 0) {
                    player1.add(pokerNum);
                } else if (i % 3 == 1) {
                    player2.add(pokerNum);
                } else {
                    player3.add(pokerNum);
                }
            }
        }
        //查看牌号
        //System.out.println(player1);
        //System.out.println(player2);
        //System.out.println(player3);
        //System.out.println(diPai);
        /*
        4.看牌
            player1、player2、player3、diPai里面的牌号，其实就是牌盒里面的键。
         */
        //遍历玩家和底牌的牌号，获取对应的牌面
        String name1 ="东方不败:";
        showPoker(pokerBox, player1, name1);

        String name2 ="令狐冲:";
        showPoker(pokerBox, player2, name2);

        String name3 ="任我行:";
        showPoker(pokerBox, player3, name3);

        String name4 ="底牌:";
        showPoker(pokerBox, diPai, name4);
    }

    public static void showPoker(HashMap<Integer, String> pokerBox, ArrayList<Integer> player1, String name) {
        //对牌号进行排序
        Collections.sort(player1);
        //展示牌
        System.out.print(name);
        System.out.print("[");
        for (Integer pokerNum : player1) {
            //根据牌号获取对应的牌面
            String poker = pokerBox.get(pokerNum);
            System.out.print(poker+" ");
        }
        System.out.println("]");
    }
}
