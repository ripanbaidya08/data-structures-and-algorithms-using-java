package io.dsalgo.array.problems.easy;

/**
 * Note: this solution is only applicable if an array doesn't contain any negative numbers
 */
public class LongestSubArrayGivenSumKPositive {

    public int lenOfLongestSubArray(int[] arr, int k) {
        int n = arr.length; // length of the array
        if (n == 0) return 0; // Handle empty array case

        int start = 0; // Start index of the current subarray
        int end = 0; // End index of the current subarray
        int maxLen = 0;
        int curSum = arr[0];

        while(end < arr.length){

            // Adjust start pointer until currentSum is less than or equal to k
            while(curSum > k && start <= end){
                curSum-=arr[start];
                start++;
            }

            // Check if currentSum equals k and update maxLen accordingly
            if(curSum == k) maxLen = Math.max(maxLen, end-start+1);

            // Increment end pointer to include new element in current sum
            end++;
            if(end < arr.length) curSum+=arr[end];
        }
        return maxLen;
        // time: O(2n), space: O(1)
    }
}
