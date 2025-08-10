package com.Algorithm.hash;

import java.util.HashMap;

public class HashPratice {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // find (target - nums[i]) in hashtable
        // if not found, add to the hashtable
        for (int i = 0; i < nums.length; i++) {
            int key = target -nums[i];
            if (map.containsKey(key)) {
                return new int[] {map.get(key), i};
            } else {
                map.put(nums[i] , i);
            }
        }
        return null;
    }
}
