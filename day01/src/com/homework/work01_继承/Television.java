package com.homework.work01_继承;

/**
 * 电视
 */
public class Television extends ElectricalAppliance {

    private String screenSize; //屏幕尺寸
    private String resolutionRatio; //分辨率

    //空参构造
    public Television() { }

    //全参构造
    public Television(String brand, String model, String color, double price, String screenSize, String resolutionRatio) {
        super(brand, model, color, price);
        this.screenSize = screenSize;
        this.resolutionRatio = resolutionRatio;
    }

    //getter & setter

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getResolutionRatio() {
        return resolutionRatio;
    }

    public void setResolutionRatio(String resolutionRatio) {
        this.resolutionRatio = resolutionRatio;
    }
}
