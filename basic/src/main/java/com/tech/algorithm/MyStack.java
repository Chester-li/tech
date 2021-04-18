package com.tech.algorithm;

import java.util.Arrays;

/**
 * @author chaoshuai.li
 * @date 2021/4/18
 * @description 自己实现一个栈
 */
public class MyStack {

    private Object []  array;// 存放数据的数组
    private int capacity; //栈的总容量
    private int count; //当前栈中的数据总量
    private final int GROW_FACT = 2; //增长因子

    public MyStack(){
        capacity = 8;
        count = 0;
        array = new Object[8];
    }

    public MyStack(int capacity){
        if(capacity < 0){
            throw new RuntimeException("capacity is not correct");
        }
        this.capacity = capacity;
        this.count = 0;
        array = new Object[capacity];
    }

    public Object pop(){
        if(count == 0){
            throw new RuntimeException("current stack is Empty");
        }
        return array[--count];
    }

    public void push(Object object){
        if(capacity == count){
            capacity = capacity * 2;
            array = Arrays.copyOf(array, capacity);
        }
        array[count ++] = object;
    }

    public Object peek(){
        if(count == 0){
            throw new RuntimeException("current stack is Empty");
        }
        return array[count-1];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public boolean isFull(){
        return count == capacity;
    }

    public int size(){
        return count;
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack(3);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);
        myStack.push(8);
        System.out.println(myStack.peek());//8
        System.out.println(myStack.size());//8
        for (int i = 0; i < 8; i++) {
            System.out.println(myStack.pop());
        }
        System.out.println(myStack.isEmpty());//true
        myStack.pop();
    }
}
