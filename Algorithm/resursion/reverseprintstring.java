package com.Algorithm.resursion;

public class reverseprintstring {

    /**
     * 递归打印字符串
     * @param n 从哪开始
     * @param str
     */
    public static void reversePrintString(int n , String str) {
        // 终止条件
        if (n == str.length()) {
            return;
        }
        // 先递 递归公示
        reverseprintstring.reversePrintString(n + 1, str);
        // f要干的事
        System.out.println(str.charAt(n));
    }




}
