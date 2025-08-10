package com.Algorithm.sort;


public class simplesort {
    
    public static void bubbleSort (int[] arr) {
        int n = arr.length;
        
        // external loop
        for (int i = 0; i < n - 1; i++) {

            boolean flag = false;
            // internal loop
            for (int j = 0; j < n - 1 - i ; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    flag = true;
                }
            }

            if (flag == false) {
                break;
            }
        }
    }

    public static void selectSort (int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i ; j < n ; j++) {

                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i ) {
                swap(arr, minIndex, i);
            }

        }
    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }


}
