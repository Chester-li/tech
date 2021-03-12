package com.tech.init.extend.squence;

/**
 * @author chaoshuai.li
 * @date 2021/3/11
 * @description
 */
public class Son extends Parent{

    private String sonNormalField = "子类普通变量";

    private static String sonStaticField = "子类静态变量";

    {
        System.out.println(sonNormalField);
        System.out.println("子类对象初始化块");
    }

    static {
        System.out.println(sonStaticField);
        System.out.println("子类静态代码块");
    }

    public Son (){
        System.out.println("子类构造方法");
    }

    public static void main(String[] args) {
        new Son();
    }
}
