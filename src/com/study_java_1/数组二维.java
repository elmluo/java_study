package com.study_java_1;

/**
 * Created by Administrator on 2017/5/22 0022.
 */
public class 数组二维 {
    public static void main(String[] args) {
//        int[][] nums= new int[2][3];
//        nums[0][0] = 3;

        int[][] nums = new int[][]{{1,2,2,2,2},{3,3,33,3,}};
        for (int i=0; i<nums.length; i++) {
            for (int j=0; j<nums[i].length; j++) {
                System.out.print(nums[i][j]);
            }
            System.out.println(); //实现换行
        }
    }
}
