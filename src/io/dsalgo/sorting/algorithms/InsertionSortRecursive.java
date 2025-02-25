package io.dsalgo.sorting.algorithms;

import java.util.Arrays;

public class InsertionSortRecursive {

    private static void recursiveInsertionSort(int[] arr, int i, int n) {

        if(i == n)
            return;

        int j = i ;
        while(j > 0 && arr[j-1] > arr[j]){
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
            j --;
        }
        recursiveInsertionSort(arr, i+1, n);
    }

    public static void main(String[] args) {

        int[] arr = {21, 23, 2, 6, 3, 19, 5};

        System.out.println("Before Sorting :"+ Arrays.toString(arr));
        recursiveInsertionSort(arr, 0, arr.length-1);
        System.out.println("After Sorting :"+ Arrays.toString(arr));
    }
}
