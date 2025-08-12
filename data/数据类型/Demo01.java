package com.data.数据类型;

public class Demo01 {

    public static void main(String[] args) {
        int j = 21;
        String str = j + ""; // "21" 常用
        String str4 = Integer.toString(j); // "21"
        System.out.println(str4 + 4);
        System.out.println(str + 1);

        String str1 = "23";
        Integer i = Integer.valueOf(str1); // 23 
        System.out.println(i + 1);
        String str2 = "98.78";
        Double d = Double.valueOf(str2); // 98.78
        System.out.println(d + 1);
    }



}

