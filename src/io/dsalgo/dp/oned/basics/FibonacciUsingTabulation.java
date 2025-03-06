package io.dsalgo.dp.oned.basics;

import java.util.Arrays;

public class FibonacciUsingTabulation {

    // time: O(n), space: O(n)  for 1d dp array
    public static int fib(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1); // fill the dp array by -1

        if(n <= 1) return n; // base

        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; i ++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    // Optimization of the space
    public static int fib2(int n){
        int prev = 1;
        int prev2 = 0;

        for(int i = 2; i <= n; i ++){
            int cur = prev + prev2;
            prev2 = prev;
            prev = cur;
        }
        // time: O(n), space: O(1)
        return prev;
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println(fib(n));
    }
}
