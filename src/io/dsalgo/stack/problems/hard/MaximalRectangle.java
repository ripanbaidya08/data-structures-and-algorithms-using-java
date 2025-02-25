package io.dsalgo.stack.problems.hard;

import java.util.ArrayDeque;
import java.util.Deque;

// 85. Maximal Rectangle
class MaximalRectangle {
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

    public int[][] prefSumMat(int[][] matrix) {
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
        return new int[0][0]; 
    }

    int n = matrix.length, m = matrix[0].length;
    int[][] pref = new int[n][m];

    for (int j = 0; j < m; j++) { // column-wise
        int sum = 0;
        for (int i = 0; i < n; i++) { // row-wise
            if (matrix[i][j] == 0) {
                sum = 0; 
            } else {
                sum += matrix[i][j];
            }
            pref[i][j] = sum;
        }
    }

    return pref;
    }

    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0; 
        }

        int n = matrix.length, m = matrix[0].length;
        int[][] intMatrix = new int[n][m];

        // Convert char[][] to int[][]
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                intMatrix[i][j] = matrix[i][j] - '0'; // Convert char '1'/'0' to int 1/0
            }
        }

        int[][] pref = prefSumMat(intMatrix);
        int result = 0;
        for(int i = 0; i < pref.length; i ++){
            result = Math.max(result, largestRectangleArea(pref[i]));
        }
        return result;  
    }
}