package com.lsf.container;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {
        subListTest();
    }

    public static void subListTest() {
        String str = "1,2,3,4,5,6,7,8,9,10";
        String[] array = str.split(",");
        List<String> list = new ArrayList<String>();
        Collections.addAll(list, array);
        List<List<String>> finalList = chopped(list, 3);
        System.out.println(finalList.get(0));
    }

    static <T> List<List<T>> chopped(List<T> list, final int L) {
        List<List<T>> parts = new ArrayList<List<T>>();
        final int N = list.size();
        for (int i = 0; i < N; i += L) {
            parts.add(new ArrayList<T>(list.subList(i, Math.min(N, i + L))));
        }
        return parts;
    }

}
