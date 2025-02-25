package io.dsalgo.array.problems.medium;

import java.util.HashMap;

// find the maximum length of the subarray
// this solution is the most optimal solution if the array contains both positive & negative
public class LongestSubArrayWithSumKPositiveNegative {

    public static int getLongestSubArray(int[] arr, int k){
        // key: sum till the current index, value: index
        HashMap<Integer, Integer> preSumMp = new HashMap<>();
        int preSum = 0;
        int maxLen = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i ++){
            // Calculate the prefix sum till index i
            preSum += arr[i];

            // if preSum equals k then update the maximum length
            if(preSum == k) maxLen = Math.max(maxLen, i+1);

            // calculate the sum of remaining part i.e. x-k:
            int rem = preSum - k;

            //Calculate the length and update maxLen
            if(preSumMp.containsKey(rem)){
                int len = i - preSumMp.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            // Finally, update the HashMap checking the condition
            if(!preSumMp.containsKey(preSum)){
                preSumMp.put(preSum, i);
            }
        }
        // time: O(n log n), space: O(n)
        return maxLen;
    }
    public static void main(String[] args) {
        int[] a = { -1, 1, 1};
        int k = 1;
        int len = getLongestSubArray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}
