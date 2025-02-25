package io.dsalgo.binarysearch.problems.easy;

// Floor in a sorted array
public class FloorInSortedArray {
    static int findFloor(int[] arr, int k) {
        int ans = -1;
        int low = 0;
        int high = arr.length;

        while(low <= high){
            int mid =(low+high)/2;
            if(arr[mid] <= k){
                ans = mid;
                low = mid + 1;
            } else{
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int k = 5;

        System.out.println(findFloor(arr, k));
    }
}
