package com.tech.algorithm;

import java.util.Objects;

/**
 * @author chaoshuai.li
 * @date 2021/3/29
 * @description
 */
public class StringConvert {


    public static int convertStringToNumber(String arg){

        if(Objects.isNull(arg) || arg.trim().length() == 0){
            return 0;
        }
        //去掉空格
        arg = arg.trim();
        //标示正数还是负数
        int symbol = 1;

        char firstChar = arg.charAt(0);
        if(firstChar == '+' || firstChar == '-'){
            if(firstChar == '-') {
                symbol = -1;
            }
            arg = arg.substring(1);//去符号
        }else if(firstChar >'9' || firstChar<'0'){
            return 0;
        }

        String[] split = arg.split("\\.");
        if(split.length > 2){
            return 0;
        }

        if(split.length == 1){
            return getInt(split[0],  symbol);
        }
        if(split.length == 2){
            try {
                Long.parseLong(split[1]);
            }catch (Throwable throwable){
                return 0;
            }
            return  getInt(split[0], symbol);
        }
        return 0;
    }

    private static int getInt(String arg, int symbol){
        try {
            long result = Long.parseLong(arg);
            if(result > Integer.MAX_VALUE){
                return Integer.MAX_VALUE * symbol;
            }
            return (int) (result * symbol);
        }catch (Throwable throwable){
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(convertStringToNumber("1.0"));
        System.out.println(convertStringToNumber("-10000.01"));
        System.out.println(convertStringToNumber("123123123123123"));
        System.out.println(convertStringToNumber("-354353453453453 "));
    }
}
