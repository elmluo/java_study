package com.study_java_1;
import java.util.Arrays;

/**
 * Created by Administrator on 2017/5/22 0022.
 */
public class 数组Array类的操作 {
    public static void main(String[] args) {
        /**
         * Arrays 类是 Java 中提供的一个工具类，
         * 在 java.util 包中。该类中包含了一些方法用来直接
         * 操作数组 、搜索等（关于类和方法的相关内容在后面的章节中会详细讲解滴~~）
         */
        /* 首字母升序排序Arrays.sorts */
        int[] nums = new int[]{12,23,22,33,55,6,456,45};
        Arrays.sort(nums);
        for (int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }

        /* 转化成字符串 Arrays.toString(数组名);
        * 可以使用 toString( ) 方法将一个数组转换成字符串，
        * 该方法按顺序把多个数组元素连接在一起，
        * 多个元素之间使用逗号和空格隔开
        *
        * */
        String result = Arrays.toString(nums);
        System.out.print(result);
    }
}
