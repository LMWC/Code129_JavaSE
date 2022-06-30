package com.itheima04_内部类.p02匿名内部类;

/*
1.介绍：内部类的简化写法。它的本质是一个指定父类或接口的(带具体实现)子类或实现类对象。
2.意义:当一个类或接口中的方法，在重写后，只需要使用1次的时候，可以使用匿名内部类简化书写。
3.格式:
    new 父类名或者接口名(){  // 方法重写 };
    表示创建了new后面指定类型的子类或实现类对象，而不需要体现这个子类或实现类的名字(匿名)
4.使用场景
    通过多态的形式指向父类引用
    直接调用方法
    作为方法参数传递

需求:
 */
public class Test {
    public static void main(String[] args) {
        //普通方式完成步骤:1.定义实现类  2.重写抽象方法 3.创建实现类对象  4.调用方法将对象传入
        FlyableImpl f = new FlyableImpl();
        showFly(f);
        System.out.println("-------");
        //如果定义的类的相关操作，只用1次，用普通方式太麻烦了，用匿名内部类简化。
        /*
        new 父类或接口(){ //重写父类或接口的方法 }  //整体代表new的父类或接口的  子类或实现类  “对象”
         */
        //showFly(Flyable实现类对象);
        showFly(new Flyable() {
            public void fly() {
                System.out.println("螺旋式起飞....");
            }
        });

        //使用场景
        //通过多态的形式指向父类引用
        Flyable f2 = new Flyable() {
            public void fly() {
                System.out.println("螺旋式起飞....");
            }
        };
        f2.fly();
        //直接调用方法
        new Flyable() {
            public void fly() {
                System.out.println("螺旋式起飞....");
            }
        }.fly();
        //作为方法参数传递
        showFly(new Flyable() {
            public void fly() {
                System.out.println("螺旋式起飞....");
            }
        });
    }

    //将来必须传入的是Flyable的实现类对象
    public static void showFly(Flyable f) {
        System.out.println("准备就绪");
        f.fly();
        System.out.println("平稳落地");
    }
}
