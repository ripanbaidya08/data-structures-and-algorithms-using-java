package io.dsalgo.binarysearch.problems.easy;

// 35. Search Insert Position
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        int ans = nums.length;

        while(low <= high){
            int mid = (low+high)/2;

            if(nums[mid] >= target){
                ans = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 5;

        System.out.println(new SearchInsertPosition().searchInsert(arr, target));
    }
}
