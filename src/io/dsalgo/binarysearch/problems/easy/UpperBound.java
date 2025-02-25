package io.dsalgo.binarysearch.problems.easy;

public class UpperBound {
    public static int upperBound(int []arr, int n, int x) {
        int low = 0;
        int high = n-1;
        int ans = n;

        // lower bound: The smallest index, such that arr[idx] >= x
        while(low <= high){
            int mid = (low+high)/2;

            if(arr[mid] > x){
                ans = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;

        System.out.println(upperBound(arr, arr.length, target));
    }
}
