package com.lsf.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by shengfeng on 2016/10/18.
 * 
 * 现在有一个文挡是a.txt，然后要把a.txt中的内容复制到b.txt中
 */
public class InputStreamTest {

    public static void main(String[] args) throws IOException {
        copyFile();
    }

    // read(): 从输入流中读取数据的下一个字节。返回 0 到 255 范围内的 int 字节值。如果因为已经到达流末尾而没有可用的字节，则返回值
    // -1。

    // 在输入数据可用、检测到流末尾或者抛出异常前，此方法一直阻塞。
    public static void copyFile() throws IOException {
        InputStream inputStream = new FileInputStream("d:/a.txt");
        OutputStream outputStream = new FileOutputStream("e:/b.txt");
        int n = -1;
        while ((n = inputStream.read()) != -1) {
            System.out.print((char) n);
            outputStream.write(n);
        }
        System.out.println("copy success");
        inputStream.close();
        outputStream.close();
    }

}
