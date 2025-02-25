package io.dsalgo.sorting.algorithms;

import java.util.Arrays;

public class InsertionSort {

    private static void insertionSort(int[] arr) {

        for(int i = 0 ; i <= arr.length -1 ; i ++){
            int j = i ;

            while(j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j --;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {21, 23, 2, 6, 3, 19, 5};

        System.out.println("Before Sorting :"+ Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("After Sorting :"+ Arrays.toString(arr));
    }
}
