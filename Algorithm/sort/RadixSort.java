package com.Algorithm.sort;

import java.util.LinkedList;
import java.util.Queue;

public class RadixSort {

    public static void radixSort(int[] arr) {
        int max = arr[0];
        for (int nums : arr) {
            if (nums > max) {
                max = nums;
            }
        }

        // 准备十个桶（队列）
        Queue<Integer>[] queues = new Queue[10];
        for (int i = 0; i < 10; i++) {
            queues[i] = new LinkedList<>();
        }

        

    }
}
