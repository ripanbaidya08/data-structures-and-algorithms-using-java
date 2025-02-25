package io.dsalgo.searching;

import java.util.Arrays;

public class BinarySearch {

    private static boolean binarySearch(int[] arr, int target){
        // make sure the array is sorted
        Arrays.sort(arr);

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = (start + end) / 2;

            if(arr[mid] == target)
                return true;
            else if(arr[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {1,2, 43, 23, 53, 223, 53, 6};
        int target = 100;

        System.out.println(Arrays.toString(arr));

        System.out.println(binarySearch(arr, target) ? "element "+target+" found" : "element "+target+" not found") ;
    }
}
