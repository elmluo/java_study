package com.study_java_1;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/5/16 0016.
 */
public class java循环语句编程demo2 {
    public static void main(String[] args){
        /*
        * 统计三个班级，每个班级各4名学生的总成绩和平均分；
        *   分析： 两组变量： 二重循环
        * */
        Scanner input = new Scanner(System.in);
        int classNum = 3;
        int studentNum = 4;
        double sum = 0;
        double avg = 0;
        for (int i = 1; i <= classNum; i++){
            sum = 0;    // 每一个班级循环结束需要对全局总成绩清0;
            System.out.println("****请输入第" + i + "个班级的成绩");
            for (int j = 1; j<=4; j++){
                System.out.println("请输入第"+j+"个学生成绩");
                int studentScore = input.nextInt();
                sum += studentScore;
            }
            avg = sum/studentNum;
            System.out.println("总成绩是：" + sum);
            System.out.println("平均分是：" + avg);
        }

    }
}