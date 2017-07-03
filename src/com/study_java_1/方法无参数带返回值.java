package com.study_java_1;

/**
 * Created by Administrator on 2017/5/22 0022.
 */
public class 方法无参数带返回值 {
    // 声明方法
    /*
    * 注意点
    *   1、 如果方法的返回类型为 void ，则方法中不能使用 return 返回值！
    *   2、 方法的返回值最多只能有一个，不能返回多个值。
    *   3、 方法返回值的类型必须兼容，例如，如果返回值类型为 int ，则不能返回 String 型值
    * */
    public int print() {
        int a = 1;
        int b = 2;
        return a + b; // 返回值是整形的。
    }

    public static void main(String[] args) {
        // 创建实例
        方法无参数带返回值 test = new 方法无参数带返回值();
        // 调用实例方法
        System.out.print(test.print());
    }
}
