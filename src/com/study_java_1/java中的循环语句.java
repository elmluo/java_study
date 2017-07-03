package com.study_java_1;

/**
 * Created by Administrator on 2017/5/15 0015.
 */
public class java中的循环语句 {
    public static void main(String[] args){
        /*
        * while语句先判断再执行
        * */
        // 输出1到5
        int i = 1;
        while (   i<=5    ) {
            // 输出变量的值，并且对变量加 1，以便于进行下次循环条件判断
            System.out.println(i);
            i++;
        }

        /*
        * doWhile语句 50以内偶数，实现累加求和
        * */
        int sum = 0; // 保存 1-50 之间偶数的和
        int num = 2; // 代表 1-50 之间的偶数
        do {
            sum = sum + num;
            num = num + 2; // 每执行一次将数值加2，以进行下次循环条件判断

        } while (num<=50); // 满足数值在 1-50 之间时重复执行循环
        System.out.println(" 50以内的偶数之和为：" + sum );

        /*
         * for语句
         */
        int sum1 = 0; // 保存不能被3整除的数之和

        // 循环变量 i 初始值为 1 ,每执行一次对变量加 1，只要小于等于 100 就重复执行循环
        for (int j = 1;  j<=100 ; j++  ) {

            // 变量 j 与 3 进行求模（取余），如果不等于 0 ，则表示不能被 3 整除
            if (j % 3 != 0) {
                sum1 = sum1 + i; // 累加求和
            }
        }

        System.out.println("1到100之间不能被3整除的数之和为：" + sum1);

        /*
        * break 跳出循环
        * */

        /*
        continue 跳过循环体中剩余的语句执行下一次循环
         */
        int sum2 = 0; // 保存累加值

        for (int k = 1; k <= 10; k++) {

            // 如果i为奇数,结束本次循环，进行下一次循环
            if ( k%2 != 0) {
                continue;
            }

            sum2 = sum2 + k;
        }

        System.out.print("1到10之间的所有偶数的和为：" + sum2);

        /*
        * 多重循环 打印直角三角形
        * */
        System.out.println("打印直角三角形");

        // 外层循环控制行数
        for (int m = 1;  m<= 8; m++ ) {

            // 内层循环控制每行的*号数
            // 内层循环变量的最大值和外层循环变量的值相等
                for (int n = 1; n<=m; n++ ) {

                System.out.print("*");
            }

            // 每打印完一行后进行换行
            System.out.println();
        }
    }
}
