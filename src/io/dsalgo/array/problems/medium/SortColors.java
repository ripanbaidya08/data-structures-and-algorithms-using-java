package io.dsalgo.array.problems.medium;

import java.util.Arrays;

// leetcode 75

public class SortColors {

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void sort012Better(int[] arr) {
        int n = arr.length;

        int cntZero = 0, cntOne = 0,  cntTwo = 0;

        for(int i = 0 ; i <= n-1 ; i ++){
            if(arr[i] == 0) cntZero ++;
            else if(arr[i] == 1) cntOne ++;
            else cntTwo ++;
        } // O(n)

        for(int i = 0 ; i < cntZero ; i ++)
            arr[i] = 0;
        for(int i = cntZero ; i < cntZero + cntOne ; i ++)
            arr[i] = 1;
        for(int i = cntZero+cntOne ; i < n ; i ++)
            arr[i] = 2;

        // here for these three loop: O(n)
        // time: O(2n), space: O(1)
    }

    public static void sort012(int[] arr) {
        int low = 0, mid = 0, high = arr.length -1;

        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr, mid, low);
                low ++;
                mid ++;
            }else if(arr[mid] == 1){
                mid ++;
            } else{
                swap(arr, mid, high);
                high --;
            }
        } // time: O(n), space: O(1)
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        sort012(arr);
        System.out.println(Arrays.toString(arr));
    }

}
