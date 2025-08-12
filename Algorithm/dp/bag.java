package com.Algorithm.dp;

public class bag {
    public static void main(String[] args) {
        int[] weight = {2, 3, 4, 5};
        int[] value = {3, 4, 5, 6};
        int bagCapacity = 8;

        int n = weight.length;
        // dp[i][j]表示前i个物品在容量j下的最大价值
        int[][] dp = new int[n + 1][bagCapacity + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= bagCapacity; j++) {

                if (j >= weight[i - 1]) {
                    // 可以装比较价值
                    dp[i][j] = Math.max(
                            dp[i - 1][j],
                            dp[i - 1][j - weight[i - 1]] + value[i - 1]
                    );
                } else {
                    dp[i][j] = dp[i - 1][j];
                }

            }
        }

        System.out.println(dp[n][bagCapacity]);
    }
}
