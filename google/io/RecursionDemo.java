package com.google.io;

public class RecursionDemo {

    public static void main(String[] args) {
        System.out.println(f(2));
    }

    // 猴子吃桃问题 递归算法 解决：
    public static int f(int n) {
        // 找到公式 f(n) - f(n)/2 - 1 = f(n + 1)
        // f(n) = 2f(n + 1) + 2  f(n + 1) = f(n) / 2    f(0) = 1
        // 递归方向
        if (n == 10) {
            return 1;
        }
        return 2 * f(n + 1) + 1;
    }
}
