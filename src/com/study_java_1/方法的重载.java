package com.study_java_1;

/**
 * Created by Administrator on 2017/6/5 0005.
 */
public class 方法的重载 {

    /*
    * 如果同一个类中包含了两个或两个以上
    * 方法名相同、
    * 方法参数的个数、顺序或类型不同，的方法
    * 在同类中，而且和方法的修饰符，返回类型没有关系。
    *
    * 则称为方法的重载，也可称该方法被重载了。
    *
    *
    * 调用方法是java中将根据参数的类型来判断
    * */
    public static void main(String[] args) {
        // 生成实例
        方法的重载 exampleObj = new 方法的重载();
        exampleObj.print();
        exampleObj.print("luochao");
        System.out.println(exampleObj.print("luochao","27"));
    }


    // 创建方法
    public void print() {
        System.out.println("无参的print方法");
    }

    public void print(String name) {
        System.out.println("有" + name + "为参数的print方法");
    }

    public String print(String name, String age) {
        return name + "今年" + age;
    }
}
