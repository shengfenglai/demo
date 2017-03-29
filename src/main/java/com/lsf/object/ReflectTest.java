package com.lsf.object;

import java.lang.reflect.Method;

/**
 * Created by shengfeng on 2016/12/12.
 */
public class ReflectTest {

    public static void main(String[] args) throws Exception {
        String str = "hello";

        Method m = str.getClass().getMethod("toUpperCase");
        System.out.println(m.invoke(str));

    }

}
