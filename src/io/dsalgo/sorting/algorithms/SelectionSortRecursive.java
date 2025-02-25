package io.dsalgo.sorting.algorithms;
import java.util.Arrays;

// selection sort using recursion.

public class SelectionSortRecursive {

    private static void recursiveSelectionSort(int[] arr,int i, int n) {
        if(i <= n){
            int min = i;

            for(int j = i ; j <= n-1; j ++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

            recursiveSelectionSort(arr, i+1, n);
        }

    }

    public static void main(String[] args) {

        int[] arr = {21, 23, 2, 6, 3, 19, 5};

        System.out.println("Before Sorting :"+ Arrays.toString(arr));
        recursiveSelectionSort(arr, 0, arr.length-2);
        System.out.println("After Sorting :"+ Arrays.toString(arr));
    }
}
