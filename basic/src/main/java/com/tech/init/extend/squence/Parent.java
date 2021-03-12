package com.tech.init.extend.squence;

/**
 * @author chaoshuai.li
 * @date 2021/3/11
 * @description
 */
public class Parent {

    private String parentNormalField = "父类普通变量";

    private static String parentStaticField = "父类静态变量";

    {
        System.out.println(parentNormalField);
        System.out.println("父类对象初始化块");
    }

    static {
        System.out.println(parentStaticField);
        System.out.println("父类静态代码块");
    }

    public Parent(){
        System.out.println("父类的构造方法");
    }

}
