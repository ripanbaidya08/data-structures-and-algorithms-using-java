package io.dsalgo.array.problems.easy;

/**
 * Given an array of integer arr[] and a number k. Return the maximum sum of a sub-array of size k.
 * GFG - Maximum Sum Subarray of size K
 * In this problem we need to tell that, with size k, what would be the maximum sum a subarray can have.
 *
 */
public class MaximumSumSubArrayOfSizeK {

    public int maximumSum(int[] arr, int k){
        int sum = 0;
        int maxSum = 0; // we consider that there is no negative number in the array

        // we will first take sum of first k elements
        for(int i=0; i<k; i++){
            sum += arr[i];
        }
        maxSum = sum; // assume that the sum of first k elements is the maximum sum

        /**
         * now, in each iteration, we will update the sum by adding the element from K'th index,
         * then we reduce the sum from the first index of the array.
         * if the sum is greater than the maxSum, then we will update the maxSum
         */
        for(int i = k; i < arr.length; i ++){
            sum += arr[i]; // adding the element from K'th index
            sum -= arr[i-k]; // reducing the sum from the first index of the array in each iteration
            maxSum = Math.max(maxSum, sum); // update the maxSum
        }
        // time: O(n), space: O(1)
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int k = 2; // output: 90, [by adding element 40 and 50]

        int result = new MaximumSumSubArrayOfSizeK().maximumSum(arr, k);
        System.out.println(result);
    }
}
