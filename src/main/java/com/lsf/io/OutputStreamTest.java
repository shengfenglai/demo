package com.lsf.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 * Created by shengfeng on 2016/10/18.
 * 
 * 往D盘目录下的a.txt文件写：WALKER PAUL
 */
public class OutputStreamTest {

    public static void main(String[] args) throws Exception {
        // writeStr_1();// write: WALKER PAUL

        writeStr_2();// write: WALKER PAUL
    }

    public static void writeStr_1() throws IOException {
        OutputStream os = new FileOutputStream("d:/a.txt");
        String outputStr = "WALKER PAUL";
        char[] c = outputStr.toCharArray();
        for (char c1 : c) {
            os.write(c1);
        }
        System.out.print("write success");
        os.close();
    }

    public static void writeStr_2() throws IOException {
        OutputStream writeStr = new FileOutputStream("d:/a.txt");
        PrintStream printStream = new PrintStream(writeStr);

        printStream.print("WALKER PAUL");
        System.out.println("write success");

        writeStr.close();
    }
}
