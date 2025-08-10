package com.Algorithm.sort;

public class heapsort {
    
    public static void heapSort(int[] arr) {

        int n = arr.length;

        // 1 . 建立大顶堆
        for (int i = parent(arr.length - 1); i >= 0; i --) {
            // 下沉
            shiftDown(arr, i, n);
        }
        
        // 2 . 堆排序
        for (int size = n; size > 1; size --) {
            // 交换
            swap(arr, 0, size- 1);
            // 下沉
            shiftDown(arr, 0, size - 1);
        }
        
    }

    private static void shiftDown(int[] arr, int index, int size) {

        while (true) {
            int left = index * 2 + 1;
            int right = index * 2 + 2;
            int max = index;

            if (left < size && arr[left] > arr[max]) {
                max = left;
            }
            if (right < size && arr[right] > arr[max]) {
                max = right;
            }
            if (max == index) {
                break;
            }
            swap(arr, index, max);
            index = max;
        }


    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int parent(int i) {
        return (i - 1) / 2;
    }



}
