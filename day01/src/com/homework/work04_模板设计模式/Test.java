package com.homework.work04_模板设计模式;

public class Test {
    public static void main(String[] args) {
        //员工
        Employee employee = new Employee("1","1",1);
        System.out.println(employee.getJobId()+" "+employee.getName());
        employee.notice("\t员工的工作日报");
        System.out.println("----------");
        //经理
        Manager manager = new Manager("2","2",2,2);
        System.out.println(manager.getJobId()+" "+manager.getName());
        manager.notice("\t经理的会议内容");
    }
}
