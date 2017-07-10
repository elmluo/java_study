package com.study_java_2;

/**
 * Created by Administrator on 2017/7/10 0010.
 */
public class 封装5_内部类innerClass {

    /*
    * 内部类提供了更好的封装，可以把内部类隐藏在外部类之内。不允许同一包中的其他类访问该类
    *
    * 内部类的方法，可以直接访问外部类的数据，包含private数据
    *
    * 内部类所实现的功能同样适用外部类也同样可以实现，只是有时候适用内部类方便
    *
    * 内部类有哪几种：
    *
    *   成员内部类   静态内部类   方法内部类   匿名内部类
    *
    *
    *
    * */

    /*定义一个内部类*/

    public class Inner {
        public void sendMessage(){
            System.out.println("我是 内部类 中定义的方法");
        }
    }

    /* 入口 */
    public static void main(String[] args) {

        // 创建外部类对象
        封装5_内部类innerClass obj = new 封装5_内部类innerClass();

        // 创建内部类对象
        Inner i = obj.new Inner();

        i.sendMessage();
    }

}
