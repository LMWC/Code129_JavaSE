package com.homework.work01_接口;

/**
 * UI讲师 继承 员工类 实现 绘画接口
 */
public class UITeacher extends Employee implements Paint {

    @Override
    public void work() {
        System.out.println("UI 讲师正在授课...");
    }

    @Override
    public void paint() {
        System.out.println("UI 讲师正在绘画...");
    }

    public UITeacher() {
    }

    public UITeacher(String name, String gender, String age) {
        super(name, gender, age);
    }
}
