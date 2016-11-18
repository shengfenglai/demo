package com.lsf.integer;

import java.util.Scanner;

/**
 * Created by shengfeng on 2016/10/26.
 * 这个例子只是想证明，分别从控制台输入127，128，300的时候返回的结果得出：
 * 通过valueOf产生包装对象的时候，如果int参数在-128到127之间，则直接从整形池中
 * 获得对象，不在这个范围的则通过new生成包装类对象
 */
public class IntegerTest {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int ii = scanner.nextInt();
            System.out.println("\n----------" + ii + "的相等判断-------");

            Integer param1 = new Integer(ii);
            Integer param2 = new Integer(ii);
            System.out.println("new产生的对象:" + (param1 == param2));

            param1 = ii;
            param2 = ii;
            System.out.println("基本类型的转换:" + (param1 == param2));

            param1 = Integer.valueOf(ii);
            param2 = Integer.valueOf(ii);
            System.out.println("valueOf产生的对象:" + (param1 == param2));

        }


    }
}
