package com.google.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {

    public static void main(String[] args) {
       copyFile("src/1.txt","src/2.txt");
    }

    public static void copyFile(String src, String dest){
        try (
                FileInputStream fileInputStream = new FileInputStream(src);
                FileOutputStream fileOutputStream = new FileOutputStream(dest);

                ) {
 
            byte[] bytes = new byte[1024];
            int len;
            while ((len = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes,0,len);
            }

            System.out.println("复制成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
