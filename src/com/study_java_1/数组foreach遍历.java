package com.study_java_1;

/**
 * Created by Administrator on 2017/5/22 0022.
 */
public class 数组foreach遍历 {
    public static void main(String[] args) {
        /*
        * foreach循环遍历当中的每一个元素
        * for (变量类型 便令名 : 数组)
        * */
        String[] names = new String[]{"张三", "李四", "王五", "张六"};
        int index = 0;
        for (String name : names) {
            System.out.print(name);
            //输出下标
            index++;
            System.out.println(index);
        }
    }
}
