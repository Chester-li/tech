package com.tech.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chaoshuai.li
 * @date 2021/3/29
 * @description 上楼梯 算法
 */
public class UpStair {

    private static Map<Integer, Integer> result = new HashMap<>();
    public static int getResult(int n){
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if(!result.containsKey(n)){
            result.put(n, getResult(n -1) + getResult(n -2));
        }
        return result.get(n);
    }

    public static void main(String[] args) {
        System.out.println(getResult(1));
        System.out.println(getResult(2));
        System.out.println(getResult(5));
    }
}
