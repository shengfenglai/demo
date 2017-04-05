package com.lsf.container;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapIteratorTest {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "the");
        map.put(2, "world");
        map.put(3, "change");
        map.put(4, "life");

        Set<Entry<Integer, String>> entrySet = map.entrySet();

        for (Iterator<Entry<Integer, String>> i = entrySet.iterator(); i.hasNext();) {
            Entry<Integer, String> entry = i.next();
            System.out.println("key: " + entry.getKey() + "  value: " + entry.getValue());

        }

    }

    // THE OUTPUT:
    // key: 1 value: the
    // key: 2 value: world
    // key: 3 value: change
    // key: 4 value: life
}
