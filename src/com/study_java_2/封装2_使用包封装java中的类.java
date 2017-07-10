package com.study_java_2;

/**
 * Created by Administrator on 2017/7/6 0006.
 */
public class 封装2_使用包封装java中的类 {
    /*
    * 包的作用：
    *    管理java文件
    *    解决同名文件冲突（通过不同文件名的包，可以区分相同文件名的类）
    *
    * 定义包
    *   package包名； java源程序的第一行； 用"."隔开，如包名为：com.baidu.wenku 包名字全部小写.类名可以驼峰
    *
    * 不同包名中的同名类
    *   com.douban.music.myClassMusic
    *   com.douban.movie.myClassMusic
    *
    * java是按照功能点来分包的。
    *
    * 系统中的工具包
    * java.(功能).类
    * java.lang.类 语言工具类
    * java.Util.类 包含java语言中的工具类
    * java.io.类 包含输入输出相关的工具类。
    *
    * 可以加一个同级包或者子包
    *
    * import 导入类，也可用"包名.*"，导入所有的类
    *
    *
    * */

    public 封装2_使用包封装java中的类() {
        System.out.println("我来自封装2的类");
    }

    // 入口
    public static void main(String[] args) {

    }
}
