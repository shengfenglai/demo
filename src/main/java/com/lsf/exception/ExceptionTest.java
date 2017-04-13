package com.lsf.exception;

/**
 * Created by shengfeng on 2017/04/13.
 */
public class ExceptionTest {

    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("catch exception");
        }
        System.out.println("run here");
    }

}
