package com.google.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fs = new FileInputStream("src/1.txt");

        // 一个一个字节去读 并且读汉字会乱码 垃圾代码
//        int b;
//        while ((b = fs.read()) != -1) {
//            System.out.print((char) b);
//        }




    }
}
