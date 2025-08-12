package com.Algorithm.serach;

public class BinarySearch {

    // 递归版二分查找
    public static int binarySearch(int[] arr, int target) {
        return binarySearchHelper(arr,target,0,arr.length - 1);
    }

    private static int binarySearchHelper(int[] arr, int target , int left , int right) {

        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return binarySearchHelper(arr,target,left,mid - 1);
        } else {
            return binarySearchHelper(arr,target,mid + 1 ,right);
        }

    }

    // 非递归版
    public static int binarySearch2(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;
        int mid = 0;

        while (left <= right) {
            // left = 4 right = 4 mid = 4 arr[4] = target
            mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return -1;
    }


}
