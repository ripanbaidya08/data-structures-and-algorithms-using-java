package io.dsalgo.divideandconquer.hard;

import java.util.Arrays;

/**
 * This class implements the Quick Sort algorithm.
 * Quick Sort is a divide-and-conquer algorithm.
 * It selects a 'pivot' element from the array and partitions the other elements into two sub-arrays, according to whether
 * they are less than or greater than the pivot. The sub-arrays are then sorted recursively.
 */
public class QuickSort {

    private static void qs(int[] arr, int low, int high) {
        // Base case: if the subarray has only one element, it is already sorted
        if(low < high){
            int partitionIndex = partition(arr, low, high);
            qs(arr, low, partitionIndex-1);
            qs(arr, partitionIndex+1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j){
            while (arr[i] <= pivot && i <= high-1)
                i++; // we are looking for the greatest element
            while (arr[j] > pivot && j >= low+1)
                j--;

            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    private static void quickSort(int[] arr) {
        qs(arr, 0, arr.length-1);
    }

    public static void main(String[] args) {
        int[] arr = { 21, 23, 2, 6, 3, 19, 5 };

        System.out.println("Before Sorting "+ Arrays.toString(arr));
        quickSort(arr);
        System.out.println("After Sorting :"+ Arrays.toString(arr));
    }
}