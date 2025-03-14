package io.dsalgo.recursion.problems.medium;

import java.util.ArrayList;
import java.util.List;

// 78. Subsets
class Subsets {
    private List<List<Integer>> ans = new ArrayList<>();
    private List<Integer> temp = new ArrayList<>();
    int[] nums;
    
    public List<List<Integer>> subsets(int[] nums) {
        this.nums = nums;
        dfs(0);    
        return ans;
    }

    // [1, 2, 3]
    private void dfs(int i){
        if(i == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        // decision to include nums[i]
        dfs(i+1);
        temp.add(nums[i]);

        // decision to not take nums[i]
        dfs(i+1);
        temp.remove(temp.size()-1);
    }
}