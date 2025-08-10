package com.Algorithm.sort;

public class mergeSort {

    public static void mergeSort(int[] arr, int left, int right) {

        if (left >= right) {
            return;
        }

        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);

    }

    public static void merge(int arr[], int left, int mid, int right) {
        // 临时数组
        int temp[] = new int[right - left + 1];

        int l = left;
        int r = mid + 1;
        int k = 0;

        // 1.比较左右两边的元素，谁小就放进 temp
        while (l <= mid && r <= right) {
            if (arr[l] < arr[r]) {
                temp[k++] = arr[l++];
            } else {
                temp[k++] = arr[r++];
            }
        }
        // 2.把剩余的元素直接放进 temp（因为它们已经有序）
        while (l <= mid) {
            temp[k++] = arr[l++];
        }
        while (r <= right) {
            temp[k++] = arr[r++];
        }
        // 3.把 temp 里的内容复制回原数组
        for (int i = 0; i < temp.length; i++) {
            arr[left + i] = temp[i];
        }

    }
}
