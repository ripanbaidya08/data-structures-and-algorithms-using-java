package io.dsalgo.array.problems.medium;

import java.util.HashMap;
import java.util.Map;

// 540. Single Element in a Sorted Array

public class SingleElementInSortedArray {
    // tc: O(2n), sc: O(n)
    public static int singleNonDuplicate(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i = 0 ; i < nums.length; i ++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0)+1);
        }
        for(Map.Entry<Integer, Integer> it : mp.entrySet()){
            if(it.getValue() == 1) return it.getKey();
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};

        System.out.println("Single element: "+singleNonDuplicate(nums));
    }
}
