package io.dsalgo.array.problems.easy;

// leetcode 485
public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1}; // out: 3
        int noOfOnes = countMaximumConsecutiveOnes(arr);

        System.out.println(noOfOnes);
    }

    private static int countMaximumConsecutiveOnes(int[] arr) {
        int maximumCount = 0 ;
        int count = 0 ;

        for(int i = 0 ; i < arr.length ; i ++){
            if(arr[i] == 1){
                count ++;
                maximumCount = Math.max(maximumCount, count);
            } else {
                count = 0;
            }
        }
        // time: O(n)
        return maximumCount;
    }
}
