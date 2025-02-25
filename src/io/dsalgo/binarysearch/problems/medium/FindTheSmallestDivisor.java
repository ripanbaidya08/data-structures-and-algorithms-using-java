package io.dsalgo.binarysearch.problems.medium;

import java.util.Arrays;

/**
 * 1283. Find the Smallest Divisor Given a Threshold
 * Input: nums = [1,2,5,9], threshold = 6
 * Output: 5
 * Explanation: We can get a sum to 17 (1+2+5+9) if the divisor is 1.
 * If the divisor is 4 we can get a sum of 7 (1+1+2+3), and if the divisor is 5 the sum will be 5 (1+1+1+2).
 */
public class FindTheSmallestDivisor {
    // O(nlogn)+O(log(maxi)⋅n) -> O(n log n)
    public static int sumOfAllEl(int[] nums, int div){
        int sum = 0;
        for(int i = 0; i < nums.length; i ++){
            int roundedResult = (nums[i] + div-1)/div;
            sum += roundedResult;
        }
        return sum;
    }

    public static int smallestDivisor(int[] nums, int threshold) {
        Arrays.sort(nums); // array is sort then we can apply BS
        int maxi = nums[nums.length-1]; // maxumum
        int minDiv = Integer.MAX_VALUE;

        int low = 1, high = maxi;
        while(low <= high){
            int mid = (low+high)/2;
            if(sumOfAllEl(nums, mid) <= threshold){
                high = mid - 1; // looking for smaller, means go left
            } else {
                low = mid + 1; // larger is on the right side
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5,9 };
        int threshold = 6;

        System.out.println(smallestDivisor(arr, threshold));
    }
}
