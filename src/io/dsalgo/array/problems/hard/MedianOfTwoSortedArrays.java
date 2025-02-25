package io.dsalgo.array.problems.hard;

// leetcode 4. Median of Two Sorted Arrays
class MedianOfTwoSortedArrays {
    public int[] mergeArr(int[] nums1, int[] nums2){
        int[] merge = new int[nums1.length + nums2.length];
        int k = 0;
        int i = 0, j = 0;
        int m = nums1.length - 1, n = nums2.length - 1;

        while(i <= m && j <= n){
            if(nums1[i] <= nums2[j]){
                merge[k++] = nums1[i];
                i ++;
            } else{
                merge[k++] = nums2[j];
                j ++;
            }
        }

        // exist in nums1
        while(i <= m){
            merge[k++] = nums1[i];
            i ++;
        }
        // exist in nums2
        while(j <= n){
            merge[k++] = nums2[j];
            j ++;
        }

        return merge;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = mergeArr(nums1, nums2);
        int n = mergedArray.length; 
        double ansMid = 0.0;

        if(n % 2 == 0){ // even length
            int mid = (0 + n)/2;
            ansMid = (double)(mergedArray[mid] + mergedArray[mid-1])/2;
        } else { // odd length
            int mid = (0 + n)/2;
            ansMid = mergedArray[mid];
        }

        return ansMid;
    }
}