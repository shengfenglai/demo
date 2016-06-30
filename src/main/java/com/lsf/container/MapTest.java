package com.lsf.container;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("s", "java");
        map.put("s", "c");
        System.out.println(map.get("s"));
        //output:c
    }

}
