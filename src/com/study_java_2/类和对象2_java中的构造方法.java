package com.study_java_2;

public class 类和对象2_java中的构造方法 {
    /*
    * 如何写一个构造方法，构造方法能帮我们解决什么问题
    *
    * new 后面的类其实是利用了构造方法
    *
    * 构造方法用于创建实例对象
    *
    * 构造方式：定义在java类中的用于初始化对象的方法
    * 名称和类名相同，但是没有返回值
    *
    * 无参的构造方法（如果不声明，系统也会默认生成一个)
    *   public 和类同名() {//...}
    * */

    // 声明一个无参的构造方法
    public 类和对象2_java中的构造方法() {
        System.out.println("这是一个无参的构造方法");
    }

    /**
     * 参数的构造方法
     *  目的：初始化成员变量的值("给成员变量赋值")
     *  将传入的参数列表的值付给我们的成员变量
     *  当自定义了有参数的构造方法，系统将不会默认生成无参的构造方法。
     *  和普通的方法重载是一样的，同名，但是参数不同，会根据参数来调用对应的构造方法
     */

    // 定义成员变量
    float screen;
    float cpu;
    float Gpu;

    public 类和对象2_java中的构造方法(float newScreen, float newCpu, float newGpu) {
        // 通过自定义条件，可以对传入参数做处理。
        if (newScreen < 3.5f) {
            System.out.println("小于规定值将复制为3.5");
            screen = 3.5f;
        } else {
            screen = newScreen;
        }
        cpu = newCpu;
        Gpu = newGpu;
        System.out.println("" + screen + cpu + Gpu);
    }

    public static void main(String[] args) {

        /*通过无参数的构造方法创建对象*/
        类和对象2_java中的构造方法 telPhone = new 类和对象2_java中的构造方法();

        /*有参的构造方法创建对象,并且可以给对象中的实例变量赋初始值*/
        类和对象2_java中的构造方法 telPhone2 = new 类和对象2_java中的构造方法(0.5f, 0.5f, 2f);

    }


}
