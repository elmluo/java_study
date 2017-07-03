package com.study_java_1;

/**
 * Created by Administrator on 2017/5/15 0015.
 */
public class Java中的类型转换 {
    /**
     * java中不同主句类型之间经常相互转换
     * @param args
     */
    public static void main(String[] args){
        /**
         * 自动类型转换
         */
        // 自动类型转换需要满足条件
        // 1.目标类型和源类型兼容（左右类型相同），double兼容整形但是 char 型不能兼容 int 型
        // 2.目标类型大于源类型（等号左边的大），double 类型的变量里直接可以存放 int 类型的数据，但反过来就不可以了
        int score1 = 82;
        double score2 = score1;
        System.out.println(score1);
        System.out.println(score2);

        /**
         * 强制类型转换
         */
        // 将浮点型强制转换成整形，是依靠直接去掉小数点后实现
        // 所以强制类型转换，可能会造成数据类型的丢失。
        double avg1 = 78.9;
        int avg = (int)avg1;
        System.out.println("78.9强制类型转换后的结果是：" + avg);
    }
}
