package com.study_java_1;

/**
 * Created by Administrator on 2017/5/22 0022.
 */
public class 数组的循环 {
    public static void main(String[] args) {
        /*
        * 循环输出数组当中的元素
        * */
        String[] bodys = {"head","leg","foot"};
        int i=0;
        while(i<3){
            System.out.println(bodys[i]);
            i++; //累加变量
        }
    }
}
