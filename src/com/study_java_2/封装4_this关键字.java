package com.study_java_2;

/**
 * Created by Administrator on 2017/7/6 0006.
 */
public class 封装4_this关键字 {
    /*
    * this 代表当前对象, 在类内部中使用。
    *
    * 封装对象属性的时候经常用到this关键字
    *
    * */

    private int a = 1;
    private int b = 2;
    private float c = 4.5f;

    public void setA(int a) {
        this.a = a;
    }

    public void sendMessage() {
        System.out.println("just print this:" + this.a);
    }

    public float getC() {
        return c;
    }

    public static void main(String[] args) {
        // 实例化对象
        封装4_this关键字 obj = new 封装4_this关键字();

        obj.sendMessage();
    }

}
