package com.study_java_2;

/**
 * Created by Administrator on 2017/7/3 0003.
 *
 * 总结：static：1.变量，犯法，块；2、实例共享 3、类名. 实例. 均可访问 4.空间（直到类卸载）
 *
 */
public class 类和对象3_static静态变量 {
    /*
    * static 可以修饰变量，方法，代码块；
    *
    * 修饰的成员称为，静态成员或者类成员；
    *
    * 属于类，被所有实例对象共享
    *
    * 可以通过 "类名.staticMember" 访问（建议用类名访问） 也可以通过实例对象.staticMember访问
    *
    * 静态成员属于整个类，当系统第一次使用该类时，就会为其分配内存空间直到该类被卸载才会进行资源回收
    *
    * */

    static String name = "luochao";

    // 调用入口
    public static void main(String[] args) {
        System.out.println("通过类名直接访问：" + 类和对象3_static静态变量.name);

        类和对象3_static静态变量 person = new 类和对象3_static静态变量();
        System.out.println("通过实例化对象访问：" + person.name);

        person.name = "luxiangyuan";    // 实例赋值会修改原静态成员
        System.out.println("使用对象名的形式修改静态变量为：" + person.name);

        System.out.println("类名访问静态变量值已经被修改：" + 类和对象3_static静态变量.name);
    }
}
