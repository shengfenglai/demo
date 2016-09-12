package com.lsf.exception;

import org.apache.commons.lang3.math.NumberUtils;

/**
 * Created by shengfeng on 2016/9/12.
 */
public class NumberFormatException {

    public static void main(String[] args) {
        System.out.println(getNum());
    }

    public static  int getNum() {
        int a = 0;
        try {
            String str = "test";
            a = Integer.parseInt(str);
            return a;
        } catch (java.lang.NumberFormatException e) {
            a = 1;
            return a;
        } finally {
            a = 2;
        }
    }
}
