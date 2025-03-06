package io.dsalgo.dp.oned.basics;

import java.util.Arrays;

public class FibonacciUsingMemoization {
    public static int f(int n, int[] dp){
        if(n <= 1) return n;
        if(dp[n] != -1) return dp[n];

        return dp[n] = f(n-1, dp) + f(n-2, dp);
    }
    public static int fib(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1); // fill the dp array by -1

        int res = f(n, dp);
        return res;
    }
    public static void main(String[] args) {
        int n = 5;

        // time: O(n), space: O(n) + O(n) stack space, and 1d dp array
        System.out.println(fib(n));
    }
}
