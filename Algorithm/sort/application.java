package com.Algorithm.sort;

import java.util.Arrays;

public class application {

    public static void main(String[] args) {
        int[] arr = {6,2,7,8,10,4,11,34,56,32};
//        heapsort.heapSort(arr);
//        simplesort.bubbleSort(arr);
//        simplesort.selectSort(arr);
//        QuickSort.quickSort(arr, 0, arr.length - 1);
//        mergeSort.mergeSort(arr, 0, arr.length - 1);
        RadixSort.radixSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
