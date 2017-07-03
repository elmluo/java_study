package com.study_java_2;

/**
 * Created by Administrator on 2017/7/3 0003.
 */
public class 封装_initialMain {


    public static void main(String[] args) {

        // 用其他类生成一个对象
        封装_什么是java中的封装 telephone = new 封装_什么是java中的封装(3f, 4f);

        System.out.println(telephone.getScreen());  // 获得初始值

        telephone.setScreen(500f);  // 重新设置初始值
        System.out.println(telephone.getScreen());


    }

    ;
}
