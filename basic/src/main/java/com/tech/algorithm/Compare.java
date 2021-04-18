package com.tech.algorithm;

/**
 * @author chaoshuai.li
 * @date 2021/4/18
 * @description 自己设计一个泛型的获取数组最小值的函数.并且这个方法只能接受Number的子类并且实现了Comparable接口。
 */
public class Compare {

    public static  <T extends Number & Comparable<? super T>> T getMinNumber(T [] array){
        if(array == null || array.length == 0){
            return null;
        }
        T min = array[0];
        for(int i = 1 ; i < array.length; i++){
            if(array[i].compareTo(min) < 0 ){
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int minInteger = getMinNumber(new Integer[]{1, 2, 3});//result:1
        System.out.println(minInteger);
        double minDouble = getMinNumber(new Double[]{1.2, 2.2, -1d});//result:-1d
        System.out.println(minDouble);
//        String typeError = getMinNumber(new String[]{"1","3"});//编译报错
    }
}
