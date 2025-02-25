package io.dsalgo.binarysearch.problems.easy;

/**
 * You have n coins, and you want to build a staircase with these coins.
 * The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.
 * Given the integer n, return the number of complete rows of the staircase you will build.
 * <br>
 * lc: 441. Arranging Coins
 */
public class ArrangingCoins {
    public static int arrangeCoins(int n) {
        int low = 1, high = n;
        int ans = 0; // minimum answer will always zero

        while(low <= high){
            int mid = low + (high - low) / 2;
            long sumOfMid = (long) mid * (mid + 1) / 2; // use long to avoid overflow

            if(sumOfMid == n) return mid;
            else if(sumOfMid <= n) {
                ans = Math.max(ans, mid);
                low = mid + 1;
            } else{
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(arrangeCoins(n));
    }
}
