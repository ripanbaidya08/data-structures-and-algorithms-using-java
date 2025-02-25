package io.dsalgo.stack.problems.hard;

import java.util.ArrayDeque;
import java.util.Deque;

// 84. Largest Rectangle in Histogram
class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] left = new int[n]; // all smaller, pse
        int[] right = new int[n]; // all smaller, nse

        Deque<Integer> stk = new ArrayDeque<>();
        
        for(int i = 0; i <= n-1; i ++){
            while(!stk.isEmpty() && heights[stk.peek()] >= heights[i]){
                stk.pop();
            }
            left[i] = stk.isEmpty() ? -1 : stk.peek();
            stk.push(i);
        }
        stk.clear();  
        
        for(int i = n-1; i >= 0; i --){
            while(!stk.isEmpty() && heights[stk.peek()] > heights[i]){
                stk.pop();
            }
            right[i] = stk.isEmpty() ? n : stk.peek();
            stk.push(i);
        }

        // area = arr[i] * nse[i] - pse[i] - 1
        int result = 0;
        for(int i = 0; i < n; i ++){
            result = Math.max(result, heights[i] * (right[i] - left[i] -1));
        }
        return result;
           
    }
}