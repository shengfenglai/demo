package com.lsf.properties;

import java.util.Locale;
import java.util.ResourceBundle;

public class PropertiesTest {

    public static void main(String[] args) {
        readEnUS();// print:jack
        readZhCN();// print:杰克
    }

    public static void readEnUS() {
        Locale locale = new Locale("enUS");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("messageResource", locale);
        System.out.println(resourceBundle.getString("name"));
    }

    public static void readZhCN() {
        Locale locale = new Locale("zhCN");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("messageResource", locale);
        System.out.println(resourceBundle.getString("name"));
    }

}
