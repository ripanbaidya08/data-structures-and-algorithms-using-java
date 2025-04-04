package io.dsalgo.recursion.problems.medium;

import java.util.Scanner;

/**
 * Suppose, we have an (m*n) grid, and we have to reach from (1, 1) to (m, n).
 * example: If we want to reach from (1, 1) to (3, 3) then in how many ways we can reach?
 * At a time, we can move either right or bottom.
 * {
 *     {1, 1, 1},
 *     {1, 1, 1},
 *     {1, 1, 1}
 * }
 */
public class MazePath {
    public static int maze(int row, int col, int m, int n){
        // If any point of time, we reach at either last row, or last column
        // at that time we can't move further on the right side or at the bottom, so return 1
        // Here, I am assuming i want to reach from (1,1) to (m,n)
        if(row == m || col == n) return 1; // base case.

        int bottomWays = maze(row+1, col, m, n);
        int rightWays = maze(row, col+1, m, n);

        // time: T(m,n)=T(m−1,n)+T(m,n−1)+O(1), space: O(m+n
        return bottomWays + rightWays;
    }
    public static int maze2(int m, int n){
        // Here, I am assuming i want to reach from (m,n) to (1,1)
        if(m == 1 || n == 1) return 1;
        int right = maze2(m, n-1);
        int left = maze2(m-1, n);
        return (right+left);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter m and n: ");
        int m = scan.nextInt(); // row
        int n = scan.nextInt(); // column

        System.out.println("No of ways to reach maze2: "+ maze2(m, n));
        System.out.println("No of ways to reach maze: "+ maze(1, 1, m, n));
    }
}
