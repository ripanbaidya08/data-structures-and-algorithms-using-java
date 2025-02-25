package io.dsalgo.array.problems.easy;

import java.util.Arrays;

// 217. Contains Duplicate
public class ContainsDuplicate {
    /**
     * The Approach is very simple. Sort the array and check if the adjacent elements are equal
     * if there is any equal element, return true
     * or else return false.
     */
    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums); // O(nlog(n))

        for(int i = 1; i < nums.length; i ++){
            if(nums[i] == nums[i-1])
                return true;
        } // O(n)

        // time: O(nlog(n)) + O(n) = O(nlog(n)), space: O(1)
        return false;
    }
}

