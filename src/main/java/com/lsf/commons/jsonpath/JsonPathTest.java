package com.lsf.commons.jsonpath;

import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import com.jayway.jsonpath.JsonPath;

public class JsonPathTest {

    public static void main(String[] args) throws Exception {
        String json = getJsonStr();

        String author = JsonPath.read(json, "$.store.book[0].author");
        System.out.println(author);

        System.out.println();


        List<String> authors = JsonPath.read(json, "$.store.book[*].author");
        for (String auth : authors) {
            System.out.println(auth);
        }

        System.out.println();


        List<Object> books = JsonPath.read(json, "$.store.book[?(@.category == 'reference')]");
        for (Object o : books) {
            System.out.println(o);
        }

        System.out.println();


        List<Object> books2 = JsonPath.read(json, "$.store.book[?(@.price>10)]");
        for (Object o : books2) {
            System.out.println(o);
        }

        System.out.println();


        List<Object> books3 = JsonPath.read(json, "$.store.book[?(@.isbn)]");
        for (Object o : books3) {
            System.out.println(o);
        }

        System.out.println();


        List<Double> prices = JsonPath.read(json, "$..price");
        for (Double price : prices) {
            System.out.println(price);
        }

    }

    public static String getJsonStr() throws Exception {
        Properties props = new Properties();
        InputStream in = JsonPathTest.class.getClassLoader().getResourceAsStream("json.properties");
        props.load(in);
        return props.getProperty("json");
    }
}
