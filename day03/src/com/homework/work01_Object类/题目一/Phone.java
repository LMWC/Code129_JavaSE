package com.homework.work01_Object类.题目一;

/**
 * 手机
 */
public class Phone {

    //成员变量
    private String brand;   //品牌
    private String color;   //颜色
    private double price;   //价格

    //空参构造
    public Phone() {
    }

    //全参构造
    public Phone(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    //toString
    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    //getter & setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
