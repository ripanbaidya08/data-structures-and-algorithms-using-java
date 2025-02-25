package io.dsalgo.recursion.problems.easy;

// 70. Climbing Stairs
/**
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * */
public class ClimbingStairs {
    private static int stair(int n){
        if(n >= 1 && n <= 2) return n;
        return stair(n-1) + stair(n-2);
    }
    private static int stair2(int n){
        // Optimal time & space
        if(n >= 1 && n <= 2) return n;
        int prev1 = 1, prev2 = 2;
        for(int i = 3; i <= n; i ++){
            int current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }
        return prev2;
    }
    public static void main(String[] args) {
        int n = 5;

        System.out.println(stair(n));
    }
}
