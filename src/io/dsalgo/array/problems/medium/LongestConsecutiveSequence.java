package io.dsalgo.array.problems.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        int longest = 1 ;

        if(nums.length == 0)
            return 0;

        Set<Integer> set = new HashSet<Integer>();

        // copying elements from the nums
        for(int i = 0 ; i < nums.length ; i ++){
            set.add(nums[i]);
        }

        for(int it : set){

            if(!set.contains(it-1)){
                int cnt = 1 ;
                int val = it ;

                while(set.contains(val+1)){
                    val = val+1 ;
                    cnt = cnt + 1 ;
                }
                longest = Math.max(cnt, longest);
            }
        }
        return longest;
    }
}
