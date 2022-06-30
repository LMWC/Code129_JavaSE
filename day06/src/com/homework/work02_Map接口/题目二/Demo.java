package com.homework.work02_Map接口.题目二;

import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
        String str = "fje你kw我FDQFj你feAF他Eajf他eo2FA我FEjfew";
        //定义Map记录你=2这种统计结果
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<str.length();i++) {
            char c = str.charAt(i);
            //如果map中已经有，则对结果进行+1
            if(map.containsKey(c)) {
                map.put(c,map.get(c)+1);
            } else {
                map.put(c,1);
            }
        }

        System.out.println(map);
    }
}
