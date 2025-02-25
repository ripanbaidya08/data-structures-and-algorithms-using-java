package io.dsalgo.array.problems.easy;

// leetcode 189. Rotate Array
public class RotateArray {

    public void rotate(int[] nums, int k) {
        int n = nums.length; // length

        if(n == 0) return; // if array size is zero, then it doesn't make sense to rotate

        k = k % n;

        // first, we will rotate from 0 to (n-k-1) position
        reverse(nums, 0, (n-k-1));

        // secondly, we will reverse the last k element, from (n-k) to (n-1)
        reverse(nums, n-k, (n-1));

        // lastly, we will reverse the entire array. to get the answer.
        reverse(nums, 0, (n-1));
    }

    // this function will rotate the given array
    public void reverse(int[] arr, int i, int j){
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i ++;
            j --;
        }
    }
}
