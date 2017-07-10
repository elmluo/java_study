package com.study_java_2;

/**
 * Created by Administrator on 2017/7/6 0006.
 */
public class 封装3_java中的访问修饰符 {
    /*
    * private       本类
    * 默认           本类 同包
    * protected     本类 同包 子类
    * public        本类 同包 子类 其他
    * */

    // 属性一般都是用private方面封装和重用
    private float screen;
    private float gpu;
    private float cpu;

    public float getScreen() {
        return screen;
    }

    public void setScreen(float newScreen) {
        screen = newScreen;
    }

    // 创建无参数的构造方法
    public 封装3_java中的访问修饰符() {
        System.out.print("无参数的构造方法执行了");
    }

    // 创建有参数构造方法
    public 封装3_java中的访问修饰符(float newScreen) {
        screen = newScreen;
        System.out.print("有参数的构造方法执行了");
    }


    // 入口方法
    public static void main(String[] args) {

    }
}
