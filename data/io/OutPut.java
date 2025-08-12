package com.data.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutPut {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("src/2.txt",true); // 追加输入流
        fileOutputStream.write("hello".getBytes());
        fileOutputStream.write("\r\n".getBytes());
        fileOutputStream.write("sdfasdf".getBytes());
        fileOutputStream.close();

    }
}
