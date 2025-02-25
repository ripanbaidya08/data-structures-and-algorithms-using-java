package io.dsalgo.stack.problems.medium;

import java.util.ArrayDeque;
import java.util.Deque;

// 907. Sum of Subarray Minimums
class SumOfSubarrayMinimums {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];

        Deque<Integer> stk = new ArrayDeque<>();
        // left
        for(int i = 0; i <= n-1; i ++){
            while(!stk.isEmpty() && arr[stk.peek()] >= arr[i]){
                stk.pop();
            }
            left[i] = stk.isEmpty() ? -1 : stk.peek();
            stk.push(i);
        }
        stk.clear(); // clear it 
        // right
        for(int i = n-1; i >= 0; i --){
            while(!stk.isEmpty() && arr[stk.peek()] > arr[i]){
                stk.pop();
            }
            right[i] = stk.isEmpty() ? n : stk.peek();
            stk.push(i);
        }
        
        final int mod = (int) 1e9 + 7;
        long ans = 0;
        for (int i = 0; i < n; ++i) {
            ans += (long) (i - left[i]) * (right[i] - i) % mod * arr[i] % mod;
            ans %= mod;
        }
        return (int) ans;
    }
}