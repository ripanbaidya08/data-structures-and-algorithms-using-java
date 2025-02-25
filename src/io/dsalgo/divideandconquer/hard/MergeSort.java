package io.dsalgo.divideandconquer.hard;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class implements the Merge Sort algorithm, a divide-and-conquer algorithm
 * that splits an array into smaller subarrays, sorts them individually, and then
 * merges them back together in sorted order.
 */
public class MergeSort {

    private static void merge(int[] arr, int low, int mid, int high) {
        // Create a temporary ArrayList to store the merged subarray
        ArrayList<Integer> temp = new ArrayList<>();

        int left = low; // starting index of the first subarray
        int right = mid + 1; // starting index of the second subarray

        // Merge the two subarrays into the temporary ArrayList
        while (left <= mid && right <= high) {
            // Compare elements from the two subarrays and add the smaller one to the temporary ArrayList
            if (arr[left] <= arr[right]) {
                temp.add(arr[left++]); // increment left index
            } else {
                temp.add(arr[right++]); // increment right index
            }
        }

        // Add any remaining elements from the first subarray to the temporary ArrayList
        while (left <= mid) {
            temp.add(arr[left++]);
        }

        // Add any remaining elements from the second subarray to the temporary ArrayList
        while (right <= high) {
            temp.add(arr[right++]);
        }

        // Copy the merged subarray back into the original array
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low); // adjust index to match original array
        }
    }

    private static void mergeSort(int[] arr, int low, int high) {
        // Base case: if the subarray has only one element, it is already sorted
        if (low >= high) {
            return;
        }

        // Find the middle index of the subarray
        int mid = (low + high) / 2;

        mergeSort(arr, low, mid); // sort left subarray
        mergeSort(arr, mid + 1, high); // sort right subarray

        // Merge the two sorted subarrays
        merge(arr, low, mid, high);
    }


    public static void main(String[] args) {
        int[] arr = {21, 23, 2, 6, 3, 19, 5};

        System.out.println("Before Sorting: " + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);

        System.out.println("After Sorting: " + Arrays.toString(arr));
    }
}