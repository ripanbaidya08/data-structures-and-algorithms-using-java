package io.dsalgo.stack.problems.medium;

import java.util.Stack;

// leetcode 503. Next Greater Element II
class NextGreaterElement_II {
    public int[] nextGreaterElementsBrute(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        for(int i = 0; i < n; i ++){
            boolean found = false;
            for(int j = i+1; j <= i+n-1; j ++){
                int idx = (j % n);
                if(nums[idx] > nums[i]){
                    res[i] = nums[idx];
                    found = true;
                    break;  
                }
            }
            if(!found) res[i] = -1;
        }
        return res;  
    }

    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = 2*n-1; i >= 0; i --){
            while(!st.empty() && st.peek() <= nums[i%n]){
                st.pop();
            }

            if(i < n){
                res[i] = st.empty() ? -1 : st.peek();
            }
            st.push(nums[i%n]);
        }
        return res;  
    }
}