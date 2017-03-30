package com.lsf.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

    public static void main(String[] args) {
        String str = "HelloWorld";
        Pattern pattern = Pattern.compile("^H");// 匹配是否是以字母H开头的字符串，如果是的话，返回true
        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.find());
    }

}
