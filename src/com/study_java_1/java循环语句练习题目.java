package com.study_java_1;
// 导入工具包
import java.util.Scanner;
/**
 * Created by Administrator on 2017/5/16 0016.
 */
public class java循环语句练习题目 {
    /*
    * 为指定成绩加分，53
    * 直到分数大于等于 60 为止，
    * 输出加分前和加分后的成绩，并统计加分的次数
    * */
    public static void main(String[] args){
        /*
        * 通过Scanner工具类获取用户自己输入成绩信息;
        * Scanner类位于java.util这个包当中;毒药导入
        * 步骤：
        *   导入java.util.Scanner
        *   创建Scanner对象
        *   接受并保存用户时输入的值
        * */

        Scanner input = new Scanner(System.in);         //创建Scanner对象
//        System.out.println("请输入考试成绩");
        System.out.print("请输入考试成绩"); // print输入不换行，pringln换行

        int scroe = input.nextInt(); //获取整数；获取用户输入的成绩。
        int count = 0;
        System.out.println(scroe);
        while(scroe < 60){
            scroe ++;
            count ++;
        }
        System.out.println("累加后的分数：" + scroe);
        System.out.println("累加的次数是：" + count);
    }


}
