package io.dsalgo.dp.oned.problems.easy;

import java.util.Arrays;

// 70. Climbing Stairs
class ClimbingStairs {
    public int climbStairs(int n) {
        // Create a memoization array to store intermediate results
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1); // Initialize all values to -1 (Uncompleted)

        // Base cases
        if (n == 1) return 1;
        if (n == 2) return 2;

        // If the result is already computed, return it
        if (dp[n] != -1) return dp[n];

        // Recursively compute and store the result
        dp[n] = climbStairs(n - 1) + climbStairs(n - 2);
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;

        ClimbingStairs obj = new ClimbingStairs();

        System.out.println(obj.climbStairs(n));
    }
}