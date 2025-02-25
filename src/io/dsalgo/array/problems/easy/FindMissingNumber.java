package io.dsalgo.array.problems.easy;

// find the missing number in the array.
// leetcode 268
public class FindMissingNumber {

    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 5};
        int N = 5;

        int missingNumber = findMissingNumber(arr, N);

        System.out.println(missingNumber);
    }

    private static int findMissingNumber(int[] arr, int N) {

        int sumOfAllN_Numbers = N*(N+1)/2; // O(1)
        int actualSum = 0;

        for(int i = 0 ; i <= arr.length-1; i ++){
            actualSum += arr[i]; // O(n)
        }

        // time : O(n) + O(1) + O(n) ==> O(n) , space = O(1)
        return (sumOfAllN_Numbers - actualSum); // O(1)
    }
}
