package com.Algorithm.string;

public class KMP {
    public static void main(String[] args) {
        String text = "ababcabcacbab";
        String pattern = "abcac";

        int index = kmpSearch(text, pattern);

        if (index != -1) {
            System.out.println("匹配成功，位置：" + index);
        } else {
            System.out.println("未找到匹配");
        }
    }

    // KMP 主函数
    public static int kmpSearch(String text, String pattern) {
        int[] lps = buildLPS(pattern); // 构建部分匹配表

        int i = 0; // 指向 text
        int j = 0; // 指向 pattern

        while (i < text.length()) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
                if (j == pattern.length()) {
                    return i - j; // 找到匹配，返回起始位置
                }
            } else {
                if (j != 0) {
                    j = lps[j - 1]; // 根据部分匹配表跳转
                } else {
                    i++;
                }
            }
        }
        return -1; // 没找到
    }

    // 构建 LPS 数组（部分匹配表）
    public static int[] buildLPS(String pattern) {
        int[] lps = new int[pattern.length()];
        int len = 0; // 记录当前最长相等前后缀长度
        int i = 1; // 从第二个字符开始

        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                // 查表回退
                if (len != 0) {
                    len = lps[len - 1]; // 回退
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}

