package com.lsf.commons.lang3;

import org.apache.commons.lang3.StringUtils;

public class StringUtilsTest {

    public static void main(String[] args) {
        //judge null and " " 
        System.out.println(StringUtils.isEmpty(""));
        System.out.println(StringUtils.isEmpty(null));
        System.out.println(StringUtils.isNotEmpty(null));
        
    }
}
