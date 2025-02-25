package io.dsalgo.array.problems.medium;

//2348. Number of Zero-Filled Subarrays
public class NumberOfZeroFilledSubArray {
    public static long zeroFilledSubarray(int[] nums) {
        long ans = 0, count = 0;
        int n = nums.length;

        for(int i = 0; i < n; i ++){
            if(nums[i] == 0){
                count++; // Increment count for each zero found
                ans+= count; // Add current count to ans
            } else {
                count = 0; // Reset count when a non-zero is encountered
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,0,0,2,0,0,4};

        long ans = zeroFilledSubarray(nums);
        System.out.println(ans);
    }
}
