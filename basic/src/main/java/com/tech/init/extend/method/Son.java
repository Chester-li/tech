package com.tech.init.extend.method;

/**
 * @author chaoshuai.li
 * @date 2021/3/11
 * @description
 */
public class Son extends Parent {

    private String sonHello = "son hello";

    public String getHello() {
        return sonHello;
    }

    public static void main(String[] args) {
        new Son();
    }
}
