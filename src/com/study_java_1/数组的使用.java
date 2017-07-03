package com.study_java_1;

/**
 * Created by Administrator on 2017/5/16 0016.
 */
public class 数组的使用 {
    public static void main(String[] args){
        /*
        * 1.数组的声明
        *   语法：数据类型[]   数组名;
        *        数据类型   数组名[];
        * */
        int[] scores;
        double height[];
        char[] sex;
        String[] names;
        String persons[];

        /*
         * 2.分配空间
         *   语法：数组名 = new 数据类型[数组长度]
         */
        scores = new int[5];    //长度为5的整形数组
        height = new double[5];     //长度为5的浮点型数组
        names = new String[5];   //长度为5的字符串数组

        // 当然也可以合并，在声明的同时为他们分配空间
        int[] devices = new int[6];

        /*
        * 3.赋值 通过下标访问数组
        * */
        scores[0] = 39;
        scores[1] = 89;

        /*
         * 4.处理数组中的数据
         *      我们可以对赋值后的数组进行操作和处理，
         *      如获取并且输出数组中元素的值
         */
        System.out.println("数组的第二项是：" + scores[1]);

        /*
         *  5.创建数组的另外一种方式
         *      声明，分配空间， 赋值一起完成
         */
        int[] otherScores = {48,45,68,98};   //创建一个长度为4的整形数组
        String[] mas =new String[]{"456","123","123","123"};
    }
}
