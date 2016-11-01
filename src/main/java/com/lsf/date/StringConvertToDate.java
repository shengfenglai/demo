package com.lsf.date;

import org.joda.time.DateTime;

/**
 * Created by shengfeng on 2016/11/1.
 */
public class StringConvertToDate {

    public static void main(String[] args) {
        System.out.println(new DateTime("2016-11-01").toDate());
    }
}
