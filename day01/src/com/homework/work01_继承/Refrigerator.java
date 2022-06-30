package com.homework.work01_继承;

/**
 * 冰箱
 */
public class Refrigerator extends ElectricalAppliance {

    private String doorStyle; //门款式
    private String refrigerationMode; //制冷方式

    //空参构造
    public Refrigerator() { }

    //全参构造
    public Refrigerator(String brand, String model, String color, double price, String doorStyle, String refrigerationMode) {
        super(brand, model, color, price);
        this.doorStyle = doorStyle;
        this.refrigerationMode = refrigerationMode;
    }

    //getter & setter

    public String getDoorStyle() {
        return doorStyle;
    }

    public void setDoorStyle(String doorStyle) {
        this.doorStyle = doorStyle;
    }

    public String getRefrigerationMode() {
        return refrigerationMode;
    }

    public void setRefrigerationMode(String refrigerationMode) {
        this.refrigerationMode = refrigerationMode;
    }
}
