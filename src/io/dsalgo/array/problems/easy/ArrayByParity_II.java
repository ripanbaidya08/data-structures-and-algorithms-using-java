package io.dsalgo.array.problems.easy;

// 922. Sort Array By Parity II
class ArrayByParity_II {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int e = 0, o = 0; // track even & odd

        int[] even = new int[n/2];
        int[] odd = new int[n/2];
        int[] result = new int[n];

        for(int i = 0; i < n; i ++){
            if(nums[i] % 2 == 0) even[e++] = nums[i];
            else odd[o++] = nums[i];
        }
        
        // reset evne & odd index value
        e = 0;
        o = 0;

        for(int i = 0; i < n; i ++){
            if(i % 2 == 0) result[i] = even[e++];
            else result[i] = odd[o++]; 
        }
        return result;
    }
}