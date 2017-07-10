package com.study_java_2;

public class 类和对象1_成员变量和局部 {
    /*
    * 成员变量：类中定义的变量
    * 局部变量：方法中定义的变量
    *
    * 作用域不同
    *   成员变量（类中属性）：本类中，其他类，类中的方法都可以使用
    *   局部变量：定义的方法中才能使用
    *
    * 初始值不同
    *   成员变量：默认初始值赋值为0；
    *   局部变量：需要设定初始值
    *
    * 同一个方法中不允许重复声明
    * 不同方法中可以用相同的局部变量（块儿级作用域互不干扰）
    *
    * 两类变量同名时，localVariable 更有优先级（就近原则）
    *
    * */
    float screen;   // partner variable
    float cup;
    float Gpu;
    int price;

    // 定义一个方法
    void call() {
        int localVar = 0;   // local variable
        System.out.println("局部变量"+ localVar);
        System.out.println("价格:" + price);
        System.out.println("手机可以打lol功能");
    }

    void sendMessage() {
        int localVal = 20;
        System.out.println(localVal);
    }


    /*
    * 在main函数中调用方法
    * */
    public static void main(String[] args){
        // 创建实例
        类和对象1_成员变量和局部 phone = new 类和对象1_成员变量和局部();
        phone.call();
    }
}
