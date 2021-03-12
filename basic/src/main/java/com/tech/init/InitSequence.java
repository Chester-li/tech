package com.tech.init;

/**
 * @author chaoshuai.li
 * @date 2021/3/11
 * @description
 */
public class InitSequence {

    private String normalField = "普通变量";

    private static String staticField = "静态变量";

    static {
        System.out.println(staticField);
        System.out.println("静态代码块");
    }

    {
        System.out.println(normalField);
        System.out.println("对象初始化块");
    }


    public InitSequence(){
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        new InitSequence();
    }

}
