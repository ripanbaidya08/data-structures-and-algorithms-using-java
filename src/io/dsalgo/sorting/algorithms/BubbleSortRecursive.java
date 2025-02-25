package io.dsalgo.sorting.algorithms;
import java.util.Arrays;

// bubble sort using recursion.

public class BubbleSortRecursive {

    private static void recursiveBubbleSort(int[] arr, int n) {

        if(n == 1)
            return;

        for(int i = 0; i <= n-2; i ++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        recursiveBubbleSort(arr, n-1);
    }

    public static void main(String[] args) {

        int[] arr = {21, 23, 2, 6, 3, 19, 5};

        System.out.println("Before Sorting :"+ Arrays.toString(arr));
        recursiveBubbleSort(arr, arr.length-1);
        System.out.println("After Sorting :"+ Arrays.toString(arr));
    }
}
