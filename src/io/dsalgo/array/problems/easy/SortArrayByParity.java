package io.dsalgo.array.problems.easy;

// 905. Sort Array By Parity
class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int i = 0;
        for(int val : nums){
            if(val % 2 == 0) result[i++] = val;
        }

        for(int val : nums){
            if(val % 2 != 0) result[i++] = val;
        }
        return result;
    }
}