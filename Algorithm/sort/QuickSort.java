package com.Algorithm.sort;

public class QuickSort {

    public static void quickSort(int[] arr , int left , int right) {
        if (left >= right) {
            return;
        }

        int privotIndex = partition(arr, left, right);
        quickSort(arr, left, privotIndex - 1);
        quickSort(arr, privotIndex + 1, right);

    }

    //
    // 挖坑法分区（含 i/j 边界判断，比较稳）
    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[left]; // 挖出的坑（保存 pivot 值）
        int i = left;
        int j = right;

        while (i < j) {
            // 从右往左找第一个 < pivot 的
            while (i < j && arr[j] >= pivot) j--;
            if (i < j) {
                arr[i] = arr[j]; // 填到左边的坑
                i++;
            }

            // 从左往右找第一个 > pivot 的
            while (i < j && arr[i] <= pivot) i++;
            if (i < j) {
                arr[j] = arr[i]; // 填到右边的坑
                j--;
            }
        }

        // 把 pivot 放回最终位置
        arr[i] = pivot;
        return i;
    }

    // 交换两个元素
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
