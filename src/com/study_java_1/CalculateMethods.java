package com.study_java_1;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/6/5 0005.
 * 各种计算分数的方法类
 */
public class CalculateMethods {

    public static void main(String[] args) {
        /*
        * 创建实例
        * */
        CalculateMethods methods = new CalculateMethods();

        /*
        * 调用实例方法
        * */
        int[] scores = {55, 66, 66, 55, 88, 99, 44, 65, 89, 54, 15};
        int[] ages = {55, 66, 66, 55, 88, 99, 44, 65, 89, 54, 15, 153, -56};
        double average = methods.calculateAverage(scores);
        System.out.println("计算的平均值为：" + average);
        System.out.println("计算和为：" + methods.calculateSum(scores));
        System.out.println("随机生成的数组为" + Arrays.toString(methods.createIntArray(8)));
        methods.getSortAndgetTheFirstThree(ages);
    }


    // 计算数组平均值方法
    public double calculateAverage(int[] scores) {
        int i = 0;
        int sum = 0;
        while (i < scores.length) {
            sum = sum + scores[i];
            i++;
        }
        return sum / scores.length;
    }

    //累加求和的方法
    public int calculateSum(int[] args) {
        int i = 0;
        int sum = 0;
        while (i < args.length) {
            sum = sum + args[i];
            i++;
        }
        return sum;
    }

    //输入长度，随机生成指定长度的整数型数组
    // foreach 遍历拿到的结果是只读的，可以进行比较
    public int[] createIntArray(int length) {
        int[] numsArray = new int[length];
        for (int i = 0; i < length; i++) {
            numsArray[i] = (int) (Math.random() * 100);
        }
        return numsArray;
    }

    // 根据年龄数组，完成成绩排序，并且输出前三名。
    public void getSortAndgetTheFirstThree(int[] ages) {
        Arrays.sort(ages); //操作原来数组排序
        int count = 0;
        for (int i = ages.length - 1; i > 0; i--) {
            if (ages[i] < 0 && ages[i] > 100) {
                continue;
            } else {
                count++;    // 如果成绩有效，则统计数量。
                System.out.print(" " + ages[i]);
                if (count>2){
                    return;
                }
            }
        }
    }
}
