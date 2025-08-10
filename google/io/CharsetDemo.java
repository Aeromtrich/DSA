package com.google.io;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharsetDemo {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String name = "你好世界hello"; // 你 3 个 好 3个  hello 各占一个
        //byte[] bytes = name.getBytes(); // 使用平台的UTF-8编码
        // [-28, -67, -96, -27, -91, -67, -28, -72, -106, -25, -107, -116, 104, 101, 108, 108, 111]
        byte[] bytes = name.getBytes("GBK"); // 指定GBK编码

        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));

        // 解码 使用String提供的方法
        String str = new String(bytes,"GBK");
        System.out.println(str);

    }


}
