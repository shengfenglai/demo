package com.lsf.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by shengfeng on 2016/10/18.
 */
public class OutputStreamTest {

    public static void main(String[] args) throws IOException {
        testOutputStream();
    }

    public  static  void testOutputStream() throws IOException {
        OutputStream os = new FileOutputStream("d:/a.txt");
        String outputStr = "WALKER PAUL";
        char[] c = outputStr.toCharArray();
        for (char c1: c){
            os.write(c1);
        }
        System.out.print("write success");
        os.close();
    }
}
