package com.tech.init.extend.method;

/**
 * @author chaoshuai.li
 * @date 2021/3/11
 * @description
 */
public class Parent {

    private String hello = "hello";

    public String getHello(){
        return hello;
    }

    public Parent(){
        System.out.println("hello: " + getHello());;
    }

}
