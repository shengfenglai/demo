package com.lsf.io;

import java.io.File;

public class ShowFileTest {

    // 列出一个目录下的所有文件
    public static void main(String[] args) {
        File file = new File("E:/github");
        for (File fileTmp : file.listFiles()) {
            System.out.println(fileTmp.getName());
        }
    }

}
