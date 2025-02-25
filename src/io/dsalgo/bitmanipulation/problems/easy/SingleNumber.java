package io.dsalgo.bitmanipulation.problems.easy;
// 136. Single Number
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i = 0; i < nums.length; i ++){
            ans ^= nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 3, 6, 6};

        int ans = new SingleNumber().singleNumber(nums);
        System.out.println(ans);
    }
}
