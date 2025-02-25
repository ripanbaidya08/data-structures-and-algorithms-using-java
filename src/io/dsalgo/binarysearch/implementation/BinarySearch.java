package io.dsalgo.binarysearch.implementation;

import java.util.Arrays;

public class BinarySearch {
    // time: O(log n) + O, space: O(1)
    public static boolean isFound(int[] arr, int target) {
        Arrays.sort(arr); // make sure the array is sorted
        int left = 0, right = arr.length-1;

        while(left <= right){
            int mid = (left + right) / 2;

            if(arr[mid] == target) return true; // true if found
            else if(arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return false; // element not found.
    }
    public static void main(String[] args) {
        int[] arr = {1, 43 , 25, 121, 334, 235, 3, 38, 39, 75, 89, 76, 63, 89, 92, 45};
        int target = 100;

        String result = isFound(arr, target) ? "element found" : "element not found";
        System.out.println(result);


    }
}
