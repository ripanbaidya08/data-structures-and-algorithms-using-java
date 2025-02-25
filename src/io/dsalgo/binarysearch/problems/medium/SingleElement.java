package io.dsalgo.binarysearch.problems.medium;

/**
 * Problem: Given a sorted array where every element appears exactly twice except for one element
 * which appears exactly once, find that single element.
 *
 * Input: nums = [1,1,2,3,3,4,4,8,8]
 * Output: 2
 *
 * 540. Single Element in a Sorted Array
 */
public class SingleElement {

    public static int singleNonDuplicate(int[] nums) {
        int n = nums.length;

        // If the array has only one element, return that element.
        if (n == 1) return nums[0];

        // If the first element is different from the second element,
        // it means the first element is the single non-duplicate.
        if (nums[0] != nums[1]) return nums[0];

        // If the last element is different from the second last element,
        // it means the last element is the single non-duplicate.
        if (nums[n - 1] != nums[n - 2]) return nums[n - 1];

        // Initialize the search range. We start from the second element and end at the second last element
        // because we have already checked the first and last elements.
        int low = 1, high = n - 2;

        // Perform binary search within the range [low, high]
        while (low <= high) {
            int mid = (low + high) / 2;

            // If the middle element is not equal to its adjacent elements,
            // it means we have found the single non-duplicate element.
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }
            /**
             * If the middle element is equal to its left neighbor and the mid index is odd,
             * or if the middle element is equal to its right neighbor and the mid index is even,
             * it means the single element is on the right side of the mid.
             */
            if ((mid % 2 == 1 && nums[mid] == nums[mid - 1]) || (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // If no single element is found, return -1 (though the problem guarantees one single element).
        return -1;
    }


    // Main method to test the singleNonDuplicate function.
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        System.out.println(singleNonDuplicate(nums)); // Output should be 2
    }
}