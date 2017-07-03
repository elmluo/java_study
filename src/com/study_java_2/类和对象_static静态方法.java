package com.study_java_2;

/**
 * Created by Administrator on 2017/7/3 0003.
 */
public class 类和对象_static静态方法 {
    /* 定义静态成员*/
    static String name = "luochao";
    int age = 19;

    /*
    *  静态方法中可以直接调用同类中的静态成员，但不能直接调用非静态成员
    * */
    public static void print() {
        System.out.println(name);   // 静态方法调用静态成员
//        System.out.println(age);    // 不能调用非静态成员
    }

    // 调用方法入口
    public static void main(String[] args) {
        // 调用静态方法；
        类和对象_static静态方法.print();
    }
}
