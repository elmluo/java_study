package com.study_java_1;

/**
 * Created by Administrator on 2017/5/22 0022.
 */
public class 方法无参数无返值 {

    public void print() {
        System.out.println("hello word");
    }

    // 入口函数
    public static void main(String[] args) {

        // 创建类实例
        方法无参数无返值 test = new 方法无参数无返值();

        // 调用实例方法
        test.print();
    }
}
