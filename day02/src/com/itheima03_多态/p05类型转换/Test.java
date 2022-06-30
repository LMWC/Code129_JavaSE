package com.itheima03_多态.p05类型转换;

/*
1.好处和弊端
    好处：可以将方法的参数定义为父类引用，使程序编写的更简单，提高程序的灵活性，扩展性,复用性
    弊端：无法访问子类/实现类的特有方法
2.类型转换
    意义:由于多态弊端，通过父类引用,不能调用子类/实现类的特有方法，若强行调用子类/实现类特有方法，导致编译报错。
    转换的分类:向上转型、向下转型。
 	        向上转型:父类类型  变量名 = new 子类类型() 或 子类对象
 	        向下转型:子类类型 变量名 = (子类类型) 父类变量名;
    存在的问题：当“两个类型不存在继承/实现关系”或“子类引用指向父类对象”会出现类型转换异常(ClassCastException)
    解决办法变量名 instanceof 数据类型
		如果变量属于该数据类型，返回true。
		如果变量不属于该数据类型，返回false。

示例:
    动物
        行为:吃
    猫
        行为:
            吃
            捉耗子
    狗
        行为:
            吃
            看家
 */
public class Test {
    public static void main(String[] args) {

        //匿名对象  没有变量指向的对象(new 构造方法)
        //showAnimal(new Cat());

        Cat c = new Cat();
        showAnimal(c);
        Dog d = new Dog();
        showAnimal(d);
    }


    public static void showAnimal(Animal a) {
        a.eat();
        //a.catchMouse();//编译看左边   弊端:父类的引用不能使用子类的特有方法，解决思路？=父类的引用变成子类的类型的引用。
        //类型在转换的时候，有可能出现错误的转换，如果执意要转，需要自己来完成。
        //转换格式:
        //      向下转型:目标类型  变量名  =  (目标类型)对象;
        //      向上转型: 父类类型 变量名 =子类对象;
        //      错误的转型:①子类  变量名 =父类对象；  ②不存在子父关系
        //      解决办法:
        //              变量名  instanceof 类型      判断该变量名对应的对象的类型  是否属于指定的类型  是,返回true,不是返回false。
        if (a instanceof Cat) {
            Cat c = (Cat) a;
            c.catchMouse();
        } else if (a instanceof Dog) {
            Dog d = (Dog) a;// Cat cannot be cast to  Dog
            d.lookHouse();
        }


    }
}
