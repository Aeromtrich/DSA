package com.Algorithm.resursion;

import java.util.Arrays;

// 多路递归 fibonacci
public class Fibonacci {

    // version1
    public static int fibonacci01(int n) {
        if (n == 0) return 0;
        if (n == 2) return 1;
        int x = fibonacci01(n - 1);
        int y = fibonacci01(n - 2);
        return x + y;
    }

    // 优化
    public static int fibonacci02(int n) {
        int[] caches = new int[n + 1];
        Arrays.fill(caches,-1);
        caches[0] = 0;
        caches[1] = 1;
        return f(n,caches);
    }

    private static int f(int n, int[] caches) {
        if (caches[n] != -1) {
            return caches[n];
        }
        int x = f(n - 1,caches);
        int y = f(n - 2, caches);
        caches[n] = x + y;
        return caches[n];
    }
}
