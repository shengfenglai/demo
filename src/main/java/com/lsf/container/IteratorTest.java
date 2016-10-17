package com.lsf.container;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by shengfeng on 2016/10/17.
 */
public class IteratorTest {

    public static void main(String[] args) {
        testIterator();
    }

    public static void testIterator() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (Iterator<Integer> i = list.iterator(); i.hasNext(); ) {
            int n = i.next();
            System.out.println(n);
        }
    }
}
//hastNext()的作用：用来判断游标后面是否还有数据
//next()的作用：1.用来返回当前游标指向的元素 2.游标向后移一格