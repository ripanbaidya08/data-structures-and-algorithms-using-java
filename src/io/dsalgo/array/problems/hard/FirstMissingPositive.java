package io.dsalgo.array.problems.hard;

import java.util.HashSet;
import java.util.Set;

// 41. First Missing Positive
class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        // Add all nums into the HashSet
        for (int num : nums) {
            set.add(num);
        }
        // Check from 1 to infinite for the first missing number
        for (int i = 1; i <= nums.length + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1; // The function should never reach here
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0};
        System.out.println(new FirstMissingPositive().firstMissingPositive(arr));
    }
}