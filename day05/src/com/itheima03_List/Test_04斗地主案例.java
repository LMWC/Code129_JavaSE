package com.itheima03_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
需求:
    按照斗地主的规则，完成造牌发牌看牌的动作。
    具体规则：使用54张牌,三个玩家参与游戏，三人交替摸牌，每人17张牌，最后三张留作底牌。
分析
    步骤:造牌--(洗牌)--发牌--看牌
    造牌:产生54张由花色和牌号组成的(字符串)牌面存入集合
    发牌:指定4个集合，代表三个玩家和底牌，将集合中的牌分发到四个集合中
    看牌:遍历集合查看牌面
思路:
    造牌:创建集合--创建花色数组和牌号数组--利用循环嵌套拼接53张牌,并添加到集合--添加大王和小王
    发牌:定义四个集合代表玩家和底牌--(普通for)遍历牌盒拿到每张牌，并根据索引对3取余，将牌分发给四个集合。
    看牌:打印四个集合对象

*/
public class Test_04斗地主案例 {
    public static void main(String[] args) {
        /*
        1.造牌
         */
        //创建牌盒
        ArrayList<String> pokerBox = new ArrayList<>();
        //造牌，并将牌放到牌盒
        //①定义花色数组
        String[] colors = {"♠", "♥", "♣", "♦"};
        //②定义牌号数组
        String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        //③利用循环嵌套获取所有的牌
        for (String color : colors) {
            for (String number : numbers) {
                //获取一张牌
                String poker = color + number;
                //添加牌到牌盒中
                pokerBox.add(poker);
            }
        }
        //添加大小王
        pokerBox.add("小鬼");
        pokerBox.add("大鬼");

        //检查造好的牌
        //System.out.println(pokerBox);

        /*
        洗牌:明天讲 思路:把牌盒里面的顺序打乱。
         */
        Collections.shuffle(pokerBox);
        /*
        2.发牌
         */
        //创建玩家
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();
        //遍历所有的牌，分发给三个玩家及底牌(普通for,利用索引对3取余，分成3种情况)
        for (int i = 0; i < pokerBox.size(); i++) {//i的有效范围:0~53
            //获取牌
            String poker = pokerBox.get(i);

            if (i >= 51) {
                diPai.add(poker);
            } else {
                //要分发给玩家的牌
                if (i % 3 == 0) {
                    player1.add(poker);
                } else if (i % 3 == 1) {
                    player2.add(poker);
                } else {
                    player3.add(poker);
                }
            }
        }
        /*
        3.看牌
         */
        System.out.println("东方不败:" + player1);
        System.out.println("令狐冲:" + player2);
        System.out.println("风清扬:" + player3);
        System.out.println("底牌:" + diPai);
    }
}
