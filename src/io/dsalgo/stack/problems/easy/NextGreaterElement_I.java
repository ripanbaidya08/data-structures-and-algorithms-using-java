package io.dsalgo.stack.problems.easy;

// leetcode 496. Next Greater Element I
class NextGreaterElement_I {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int[] result = new int[n];

        for(int i = 0; i < n; i ++){
            boolean found = false;
            int start = 0;

            while(nums1[i] != nums2[start]) start ++; // find the position
            for(int j = start; j < m; j ++){
                if(nums2[j] > nums1[i]){
                    result[i] = nums2[j];
                    found = true;
                    break;
                }
            }
            if(!found) result[i] = -1;
        }
        return result;
    }
}