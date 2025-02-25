package io.dsalgo.binarysearch.problems.easy;

// 374. Guess Number Higher or Lower
public class GuessNumberHigherOrLower {
    /**
     * Forward declaration of guess API.
     * @param  num   your guess
     * @return 	     -1 if num is higher than the picked number
     *			      1 if num is lower than the picked number
     *               otherwise return 0
     * int guess(int num);
     */

    /**
     * public class Solution extends GuessGame {
     *     public int guessNumber(int n) {
     *         int left = 1;
     *         int right = n;
     *
     *
     *         while(left <= right){
     *             int num = left + (right - left) / 2;
     *             int out = guess(num);
     *
     *             if(out == 1) {
     *                 // num < pick
     *                 left = num + 1;
     *             } else if(out == -1){
     *                 // num > pick
     *                 right = num - 1;
     *             } else{
     *                 // found
     *                 return num;
     *             }
     *         }
     *         return -1;
     *     }
     * }
     */
}
