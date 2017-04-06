package com.lsf.string;

/**
 * Created by shengfeng on 2016/11/28.
 */
public class StringTest {

    public static void main(String[] args) {
        String s1 = "helloworld";
        String s2 = new String("helloworld");
        String s3 = "hello" + "world";
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s1.intern());
    }
}
