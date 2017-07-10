package com.study_java_2;

/**
 * Created by Administrator on 2017/7/3 0003.
 */
public class 类和方法5_static静态初始化块 {
    /**
     * java中通过初始化块，对变量进行赋值。
     * <p>
     * 在类的声明中，可以包含多个初始化块，
     * <p>
     * 当创建类的实例时，就会依次执行这些代码块。
     * <p>
     * 如果使用 static 修饰初始化块，就称为静态初始化块。
     * <p>
     * 静态初始化块只在类加载时执行，且只会执行一次，
     * <p>
     * 同时静态初始化块只能给静态变量赋值，不能初始化普通的成员变量。
     */

    // 定义成员变量
    int num1;
    int num2;
    static int num3;

    // 构造方法
    public 类和方法5_static静态初始化块(int newNum1) {
        // 给普通成员变量赋值
        num1 = newNum1;
        System.out.print("通过有参数构造方法为成员变量num1动态赋值");
    }

    // 普通初始化块
    {
        num2 = 2;
        System.out.println("通过初试化块儿为成员变量2赋值");
    }

    // 静态初试化块儿
    static {
        num3 = 3;
        System.out.println("通过静态初始化块儿为静态成员变量num3赋值");
    }

    // 入口
    public static void main(String[] args) {

        // 创建实例对象 静态初试化块，类加载时执行，且只会执行一次，
        类和方法5_static静态初始化块 hello = new 类和方法5_static静态初始化块(1);
        System.out.println("num1:" + hello.num1);
        System.out.println("num2:" + hello.num2);
        System.out.println();

        // 第二次加载类，静态初试化块儿不执行，普通初试化块儿执行
        类和方法5_static静态初始化块 hello2 = new 类和方法5_static静态初始化块(1);

    }
}
