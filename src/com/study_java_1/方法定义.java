package com.study_java_1;

/**
 * Created by Administrator on 2017/5/22 0022.
 */
public class 方法定义 {
    /**
     * java中方法的定义
     *
     * 访问修饰符 返回值类型 方法名 (参数列表) {
     *     方法体
     * }
     *
     * 访问修饰符：
     *      方法允许被访问的权限范围，
     *      可以是 public、protected、private 甚至可以省略 ，
     *      其中 public 表示该方法可以被其他任何代码调用，
     *      其他几种修饰符的之后会看到
     * 返回值类型：
     *      方法返回值的类型，如果方法不返回任何值，
     *      则返回值类型指定为 void ；
     *      如果方法具有返回值，则需要指定返回值的类型，
     *      并且在方法体中使用 return 语句返回值，
     * 方法名：
     *      定义的方法的名字，必须使用合法的标识符。
     * 参数列表：
     *      传递给方法的参数列表，
     *      参数可以有多个，多个参数间以逗号隔开，
     *      每个参数由参数类型和参数名组成，以空格隔开。
     *      根据方法是否带参、是否带返回值，可将方法分为四类：
                 Ø 无参无返回值方法
                 Ø 无参带返回值方法
                 Ø 带参无返回值方法
                 Ø 带参带返回值方法
     *
     */
    public void print () {
        System.out.print("hello word");
    }

    public static void main(String[] args) {//在main方法中调用定义的方法
        方法定义 test = new 方法定义();
        test.print();//调用方法
    }

}
