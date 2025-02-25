package io.dsalgo.array.problems.medium;

import java.util.Arrays;

/**
 * leetcode 2149
 * Rearrange array elements, so that element with positive sign appears before element with negative sign
 * Input: nums = [3,1,-2,-5,2,-4]
 * Output: [3,-2,1,-5,2,-4]
 */
public class RearrangeArrayElementsBySign {
    public static int[] rearrangeArray(int[] nums) {
        int[] temp = new int[nums.length];

        int posIdx = 0, negIdx = 1 ;
        for(int i = 0 ; i < nums.length ; i ++){
            if(nums[i] < 0){
                temp[negIdx] = nums[i];
                negIdx += 2; // negative value has odd index
            } else {
                temp[posIdx] = nums[i];
                posIdx += 2; // positive value has even index
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};
        int[] ans = rearrangeArray(arr);

        System.out.println(Arrays.toString(ans));
    }
}
