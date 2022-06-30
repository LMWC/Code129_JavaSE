package com.itheima02_Extends.p03访问规则;

public class Zi extends Fu {
    int ziNum =100;
    int num =999;
    //父类的构造方法，不能继承给子类
    //public Fu(){}
    public Zi(){
        //super();//子类的构造方法的第一行，隐含了一个访问父类的无参构造方法的操作。
        super();//手动写了，默认的就不存在了。
        //super();//不能多次调用父类的构造方法(没必要，多余的操作)
        System.out.println("子类的无参构造方法");
        //super();//必须放在第一行，作用，初始化子类内容前，先初始化父类内容。
    }
    public void ziMethod(){
        System.out.println("子类中的ziMethod方法");
    }
    public void method(){
        System.out.println("子类中的method方法");
    }

    @Override//只要重写方法， 必须写上
    //重写父类中的show方法
    //重写方法，权限大于或等于父类中该方法的权限。(报错)
    //private void show() {
    //方法重写，返回值必须与父类该方法保持一直(报错)
    //public int show() {
    //名字不同，就不是方法重写，相当于你定义了一个子类特有的方法(不报错)。
    //public void show2() {
    //参数列表不同，就相当于定义了一个跟父类继承下来的方法，重载的方法(不报错)
    //public void show(int num) {
    public void show() {
        System.out.println("子类中的show方法");
        System.out.println("一个月赚十万");
    }


}
