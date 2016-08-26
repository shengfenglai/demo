package com.lsf.commons.lang3;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTimeUtils;

public class StringUtilsTest {

    public static void main(String[] args) {

        System.out.println(StringUtils.isEmpty(""));
        System.out.println(StringUtils.isEmpty(null));
        System.out.println(StringUtils.isNotEmpty(null));

        System.out.println(testStringUtilsRight());
        System.out.println(testStringUtilsLeft());

    }

    public static String testStringUtilsRight() {
        return StringUtils.right(String.valueOf(DateTimeUtils.currentTimeMillis() / 1000), 6);
    }

    public static String testStringUtilsLeft() {
        return StringUtils.left(String.valueOf(DateTimeUtils.currentTimeMillis() / 1000), 6);
    }
}
