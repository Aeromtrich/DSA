package com.Algorithm.serach;

public class application {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,8,9};
//        int targetIndex = BinarySearch.binarySearch(arr, 8);
        int targetIndex = BinarySearch.binarySearch2(arr, 8);
        System.out.println("targetIndex = " + targetIndex);
    }
}
