package io.dsalgo.stack.problems.medium;

// 2104. Sum of Subarray Ranges
class SumOfSubarrayRanges {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long result = 0L;

        for(int i = 0; i < n; i ++){
            int min = nums[i], max = nums[i];
            for(int j = i; j < n; j ++){
                min = Math.min(min, nums[j]);
                max = Math.max(max, nums[j]);

                result+= (max-min);
            }
        }
        return result;
    }
}
