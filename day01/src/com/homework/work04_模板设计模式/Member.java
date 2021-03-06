package com.homework.work04_模板设计模式;

/**
 * 成员
 */
public abstract class Member {

    private String jobId; //工号
    private String name; //姓名
    private int age; //年龄

    //发布通知
    public void notice(String content) {
        System.out.println("通知：");
        setContent(content);
        System.out.println("\t\t必胜环球科技有限公司");
    }

    public abstract void setContent(String content);

    //空参构造、全参构造、getter、setter

    public Member(String jobId, String name, int age) {
        this.jobId = jobId;
        this.name = name;
        this.age = age;
    }

    public Member() {
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
