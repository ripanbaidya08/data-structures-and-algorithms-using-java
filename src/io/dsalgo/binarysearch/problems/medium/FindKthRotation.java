package io.dsalgo.binarysearch.problems.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Find Kth Rotation.
 * means, need to tell that how many times an array has been rotated.
 * ar = {6, 9, 2, 4}; -> 2
 * {9, 2, 4, 6}; -> 1
 * {2, 4, 6, 9}; -> 0
 *
 */
public class FindKthRotation {
    /**
     * To solve this problem, we can simply find the smallest element of the array.
     * and return the index of the smallest element.
     * and this would be our answer.
     */
    public static int findKRotation(List<Integer> arr) {
        int mini = Integer.MAX_VALUE;
        int n  = arr.size();
        int low = 0, high = n-1;
        int index = -1; // result index

        while(low <= high){
            int mid = (low+high)/2;

            if(arr.get(low) <= arr.get(high)){
                // we check manually, instead of min function, to store the index
                if(arr.get(low) < mini){
                    index = low;
                    mini = arr.get(low);
                }
                break;
            }

            if(arr.get(low) <= arr.get(mid)){
                if(arr.get(low) < mini){
                    index = low;
                    mini = arr.get(low);
                }
                low = mid + 1;
            } else{
                if(arr.get(mid) < mini){
                    index = mid;
                    mini = arr.get(mid);
                }
                high = mid - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>(List.of(6, 9, 2, 4));

        System.out.println(findKRotation(li));

    }
}
