package com.lsf.container;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysCompareCollectionsTest {

    public static void main(String[] args) {
        int count = 10000000;
        System.out.println("Arrays's time is " + arraysTest(count));
        System.out.println("Collections's time is " + collectionsTest(count));
    }

    public static long arraysTest(int count) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            List<String> arrays = new ArrayList<String>();
            arrays.addAll(Arrays.asList("hello", "java", "world"));
        }
        return System.currentTimeMillis() - startTime;
    }
    
    public static long collectionsTest(int count) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            List<String> arrays = new ArrayList<String>();
            Collections.addAll(arrays,"hello", "java", "world");
        }
        return System.currentTimeMillis() - startTime;
    }
}
