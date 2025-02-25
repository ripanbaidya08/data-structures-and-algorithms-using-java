package io.dsalgo.binarysearch.problems.medium;

// 33. Search in Rotated Sorted Array
public class SearchInRotatedArray1 {
    // Identify the Sorted half first then perfrom rest of the operation
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        while(low <= high){
            int mid = (low+high)/2;

            if(nums[mid] == target){
                return mid;
            }
            // if left half was sorted
            if(nums[low] <= nums[mid]){
                if(nums[low] <= target && target <= nums[mid]){
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                // if right half was sorted
                if(nums[mid] <= target && target <= nums[high]){
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1; // if not found
    }
}
