package com.study_java_2;

/**
 * Created by Administrator on 2017/7/3 0003.
 */
public class 封装_什么是java中的封装 {

    /*
    * 概念
    *    将类的信息隐藏在类的内部，不允许外部直接访问，
    *    而是通过该类提供的方法，来实现对隐藏信息的操作和访问
    * 优点
    *   只能通过规定的方法访问数据；
    *   隐藏类的细节，方便修改和实现
    *   防止使用的时候对属性进行意外的修改
    *
    * 封装实现步骤
    *   1.修改属性的可见性——用private修饰符
    *   2.创建getter/setter方法——用于属性的读写
    *   3.在getter/setter方法中加入属性控制语句——对属性的合法性进行判断
    *
    * */

    private float screen;
    private float cup;

    // 定义构造函数
    public 封装_什么是java中的封装(float newScreen, float newCup) {
        screen = newScreen;
        cup = newCup;
    }

    public float getScreen() {
        return screen;
    }

    public void setScreen(float newScreen) {
        this.screen = newScreen;
    }


    // 入口函数
    public static void main(String[] args) {
        封装_什么是java中的封装 telephone = new 封装_什么是java中的封装(0.5f, 0.6f);
        System.out.println(telephone.cup);  // 在同一个类中，当然可以直接访问到私有成员

        // 重新设置属性的初始值
        telephone.setScreen(123f);
        System.out.println(telephone.getScreen());  // 通过内部属性访问变量。
    }
}
