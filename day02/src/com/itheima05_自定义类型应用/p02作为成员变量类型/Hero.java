package com.itheima05_自定义类型应用.p02作为成员变量类型;

public class Hero {

    private String name;
    private Weapon wuqi;
    private Magic fashu;

    public Hero() {
    }

    public Hero(String name, Weapon wuqi, Magic fashu) {
        this.name = name;
        this.wuqi = wuqi;
        this.fashu = fashu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWuqi() {
        return wuqi;
    }

    public void setWuqi(Weapon wuqi) {
        this.wuqi = wuqi;
    }

    public Magic getFashu() {
        return fashu;
    }

    public void setFashu(Magic fashu) {
        this.fashu = fashu;
    }

    public void showHero() {
        System.out.println("英雄信息展示:");
        System.out.println("英雄名:" + name);
        System.out.println("武器展示");
        System.out.println("武器名:"+wuqi.getName());
        System.out.println("武器技能:");
        wuqi.attack();
        System.out.println("技能展示");
        System.out.println("技能名:"+fashu.getName());
        System.out.println("法术技能:");
        fashu.attack();
    }
}
