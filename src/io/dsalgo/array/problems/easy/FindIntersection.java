package io.dsalgo.array.problems.easy;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * find the intersection of two sorted arrays
 * 1. sorted array -> two pointers
 * 2. unsorted array -> hashmap
 * leetcode 349, 350
 */
public class FindIntersection {

    public int[] intersectUnsortedArray(int[] nums1, int[] nums2) {
        /**
         * we will use hashmap to solve this problem.
         * first, we'll count the frequency of each element and put it to hashmap for first array.
         * while traverse from the second array, will check hashmap already contains that element or not.
         * if yes, add it to the result. and decrement the count value.
         */

        HashMap<Integer,Integer> countMap = new HashMap<>();

        // put all elements of nums1 to hashmap and count there frequency
        for(int num : nums1){
            countMap.put(num, countMap.getOrDefault(num, 0)+1);
        }

        // declaring result set to store the intersected element
        ArrayList<Integer> result = new ArrayList<>();

        // now, for nums2 checking element is present or not.
        for(int num : nums2){
            if(countMap.containsKey(num) && countMap.get(num) > 0){
                result.add(num);
                countMap.put(num, countMap.get(num)-1);
            }
        }

        int[] ans = new int[result.size()];
        // convert arraylist to array
        for(int i = 0; i < result.size(); i ++){
            ans[i] = result.get(i);
        }

        /**
         * time: O(nums1.length + nums2.length)
         * space: O(min(nums1.length, nums2.length))
         */
        return ans;
    }

    public int[] intersectSortedArray(int[] nums1, int[] nums2) {
        /**
         * two pointers
         * time: O(min(nums1.length, nums2.length)), space: O(1)
         */
        int i = 0, j = 0, n1 = nums1.length, n2 = nums2.length;
        int[] ans = new int[Math.min(n1, n2)];
        int k = 0;
        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                ans[k++] = nums1[i];
                i++;
                j++;
            }
        }
        /**
         * time: O(n1 + n2)
         * space: O(min(n1, n2))
         */
        return ans;
    }
}
