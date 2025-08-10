package com.google.array;

import java.util.Arrays;

public class app {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,0,0,0};
        int[] arr2 = {3,8,9};
        mergeTwoSortedArray.merge(arr,5,arr2,3);
        System.out.println(Arrays.toString(arr));
    }
}
