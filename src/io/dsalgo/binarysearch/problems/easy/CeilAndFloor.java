package io.dsalgo.binarysearch.problems.easy;

import java.util.Arrays;

/**
 * Input: x = 7, arr[] = [5, 6, 8, 9, 6, 5, 5, 6]
 * Output: 6, 8
 * Explanation: Floor of 7 is 6 and ceil of 7 is 8.
 */
public class CeilAndFloor {

    // tc: 2 nlogn + logn
    public int getFloor(int[] arr, int x){
        Arrays.sort(arr);
        // largest element <= x
        int ans = -1;
        int n = arr.length;
        int low = 0, high = n-1;

        while(low <= high){
            int mid = (low+high)/2;

            if(arr[mid] <= x){
                ans = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public int getCeil(int[] arr, int x){
        Arrays.sort(arr);
        // smallest element >= x
        int ans = -1;
        int n = arr.length;
        int low = 0;
        int high = n-1;

        while(low <= high){
            int mid = (low+high)/2;

            if(arr[mid] >= x){
                ans = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public int[] getFloorAndCeil(int x, int[] arr) {
        int ansF = getFloor(arr, x);
        int ansC = getCeil(arr, x);

        return new int[]{ansF, ansC};

    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 9, 6, 5, 5, 6};
        int x = 7;

        int[] ans = new CeilAndFloor().getFloorAndCeil(x, arr);
        System.out.println(Arrays.toString(ans));
    }
}
