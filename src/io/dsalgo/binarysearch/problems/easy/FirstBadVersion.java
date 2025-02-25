package io.dsalgo.binarysearch.problems.easy;

// 278. First Bad Version
public class FirstBadVersion {

    /**
     *  The isBadVersion API is defined in the parent class VersionControl.
     *  boolean isBadVersion(int version);
     *  */
    /**
     * public class Solution extends VersionControl {
     *     public int firstBadVersion(int n) {
     *
     *         int l = 1;
     *         int r = n;
     *
     *         while(l < r){
     *             int mid = l + (r - l)/2;
     *
     *             if(isBadVersion(mid)){
     *                 r = mid;
     *             } else {
     *                 l = mid + 1;
     *             }
     *         }
     *         return r;
     *     }
     * }
     */
}
