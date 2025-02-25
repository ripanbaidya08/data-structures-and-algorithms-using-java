package io.dsalgo.sorting.algorithms;

import java.util.Arrays;

public class SelectionSort {

    private static void selectionSort(int[] arr) {
        int len = arr.length;

        for(int i = 0 ; i <= len - 2 ; i ++) {
            int min = i ;

            for(int j = i ; j <= len -1 ; j ++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {21, 23, 2, 6, 19};

        System.out.println("Before Sorting :"+ Arrays.toString(arr));

        selectionSort(arr);

        System.out.println("After Sorting :"+ Arrays.toString(arr));
    }


}
