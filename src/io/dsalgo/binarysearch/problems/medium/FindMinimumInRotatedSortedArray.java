package io.dsalgo.binarysearch.problems.medium;

// 153. Find Minimum in Rotated Sorted Array
public class FindMinimumInRotatedSortedArray {

    public int findMin(int[] arr) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int mini = Integer.MAX_VALUE;

        while(low <= high){
            int mid = (low+high)/2;

            if(arr[low] <= arr[mid]){
                // the left half is sorted
                // take the min from the left half, which would at index low
                mini = Math.min(mini, arr[low]);
                // eliminate the left half
                low = mid + 1;
            } else{
                // the right half is sorted
                // take the min from the right half, which would at index mid
                mini = Math.min(mini, arr[mid]);
                // eliminate the right half
                high = mid - 1;
            }
        }
        return mini;
    }
}
