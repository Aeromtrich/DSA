package com.Algorithm.sort;

import java.util.*;

public class RadixSort {

    public static void radixSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int maxDigit = String.valueOf(max).length();

        int place = 1;
        for (int i = 0; i < maxDigit; i++) {
            List<List<Integer>> buckets = new ArrayList<>();

            for (int j = 0; j < 10; j++) {
                buckets.add(new ArrayList<>());
            }
            // 放入桶中
            for (int num : arr) {
                int digit = (num / place) % 10;
                buckets.get(digit).add(num);
            }

            // 从桶中取回放回原数组
            int index = 0;
            for (List<Integer> bucket : buckets) {
                for (Integer num : bucket) {
                    arr[index++] = num;
                }
            }

            place *= 10;

        }
    }
}
