package io.dsalgo.array.problems.easy;

/**
 * move all the zeros to the end of the array
 * leetcode 283
 * ar = {7, 1, 0, 3, 0, 0, 2}; -> 7, 1, 3, 2, 0, 0, 0
 */
public class MoveZerosToEnd {

    // use two pointers to solve this problem.
    private int[] moveZeros(int[] arr){
        // j pointer, which will track zero
        int j = -1;

        // find the position of the first 0'th element
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }

        // if there is no zero
        if(j == -1) return arr;

        // move the pointer i and j, and move them accordingly
        for(int i = j+1; i < arr.length; i ++){
            if(arr[i] != 0) {
                // swap arr[i] & arr[j].
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j ++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {7, 1, 0, 3, 0, 0, 2}; // 7, 1, 3, 2, 0, 0, 0

    }
}
