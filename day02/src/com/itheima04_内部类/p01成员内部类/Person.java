package com.itheima04_内部类.p01成员内部类;

public class Person {
    int num =10;
    private boolean live = true; //boolean默认值是false

    public boolean isLive() {//getLive
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    class Heart {
        public void jump() {
            //内部类可以直接使用外部类的成员
            if (live) {
                System.out.println("砰砰..砰砰..");
            } else {
                System.out.println("哔......");
            }

        }
    }

    public void show(){
       //外部类想使用内部类的内容，需要先创建内部类的对象
        Heart h = new Heart();
        h.jump();
    }
}
