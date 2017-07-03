package com.study_java_1;
import java.util.Arrays;

/**
 * Created by Administrator on 2017/6/5 0005.
 */
// 定义类
public class 方法有参数有返回值 {

    //定义类中方法
    public String showString(String name){
        return "欢迎您:" + name;
    }
    public String showArray(int[] scores){
        return Arrays.toString(scores);
    }

    
    public static void main(String[] args){
        // 创建实例
        方法有参数有返回值 exampleOBj = new 方法有参数有返回值();

        // 调用实例下的方法：实参不需要指定类型
        String result = exampleOBj.showString("骆超");
        System.out.println(result);

        // 方法的参数可以是基本数据类型，如 int、double 等，
        // 也可以是引用数据类型，如 String、数组等
        int[] scores = {1,2,2,4};
        String resultArray = exampleOBj.showArray(scores);
        System.out.println("数组转字符串的结果是:"+ resultArray);
    }
}
