package io.dsalgo.array.problems.medium;
// leetcode 209
public class MinimumSizeSubArraySum {

    // using sliding window approach
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int i = 0;
        int sum = 0;

        for(int j = 0; j < nums.length; j ++){
            sum += nums[j];

            while(sum >= target){
                minLen = Math.min(minLen, j-i+1);
                sum -= nums[i]; // reduce the sum from the start
                i ++;
            }
        }
        // if no minimum length is found, return 0 or else return the minimum length
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int target = 7;

        int minLength = new MinimumSizeSubArraySum().minSubArrayLen(target, arr);
        System.out.println(minLength);
    }
}
