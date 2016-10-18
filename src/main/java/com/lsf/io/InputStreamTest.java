package com.lsf.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by shengfeng on 2016/10/18.
 */
public class InputStreamTest {

    public static void main(String[] args) throws IOException {
        testInputStream();
    }

    //read(): 从输入流中读取数据的下一个字节。返回 0 到 255 范围内的 int 字节值。如果因为已经到达流末尾而没有可用的字节，则返回值 -1。
    // 在输入数据可用、检测到流末尾或者抛出异常前，此方法一直阻塞。
    public static void testInputStream() throws IOException {
        InputStream inputStream = new FileInputStream("d:/a.txt");
        int n = -1;
        while ((n = inputStream.read()) != -1) {
            System.out.print((char) n);
        }
        inputStream.close();
    }

}
