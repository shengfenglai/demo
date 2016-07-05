package com.lsf.container;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {
        subListTest();
    }

    public static void subListTest() {
        int count = 1000;
        int index = 0;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < count; i++) {
            list.add(i + 1);
        }
        for (int i = 0; i < 20; i++) {
            List<Integer> temp = list.subList(index, index + count / 20);
            index += count / 20;
            System.out.println("the data of list " + (i + 1) + "===========>");
            for (int j = 0; j < temp.size(); j++) {
                System.out.println(temp.get(j));
            }
        }
    }

}
