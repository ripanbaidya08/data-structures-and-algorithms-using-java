package io.dsalgo.array.problems.easy;

// 1752. Check if an Array is Sorted and Rotated
public class CheckArrayIsSortedAndRotated {

    public boolean check(int[] nums) {
        /**
         * countRotation == 0, or countRotation == 1 then valid,
         * countRotation > 1 invalid
         */
        int countRotation = 0;

        for(int i = 0; i < nums.length; i ++){
            if(nums[i] > nums[(i+1) % nums.length]){
                // whatever the current element, if it is greater than its next,
                // means there is a break point
                // the last elment must be smaller or equal to the first element of the array
                countRotation ++;
            }
        }
        return countRotation <= 1;
    }
}
