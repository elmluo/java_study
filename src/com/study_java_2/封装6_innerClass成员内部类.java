package com.study_java_2;

/*
* java中的成员内部类
*
* Inner 类定义在 Outer 类的内部，相当于 Outer 类的一个成员变量的位置，
*   Inner 类可以使用任意访问控制符，如 public 、 protected 、 private 等
*
* 内部类中的如方法，可以直接访问外部类中的成员变量，不受控制符的印象
*
* */
public class 封装6_innerClass成员内部类 {

    //外部类的私有属性name
    private String name = "百度";

    //外部类的成员属性
    int age = 20;

    //成员内部类Inner
    public class Inner {
        String name = "百度";
        //内部类中的方法
        public void show() {

            // 内部类属性和外部类属性同名，内部类总通过 外部类.this.XXXX 来访问外部类的属性和方法
            System.out.println("外部类中的name：" +  封装6_innerClass成员内部类.this.name );
            System.out.println("内部类中的name：" +  name );
            System.out.println("外部类中的age：" + age);
        }
    }

//    Inner1.show() 外部类不能直接访问内部类属性和方法，必须先创建内部类实例对象

    public static void main (String[] args) {

        // 创建外部类实例
        封装6_innerClass成员内部类 outer = new 封装6_innerClass成员内部类 ();

        // 创建内部类实例
        Inner i = outer.new Inner ();

        i.show();

    }
}
