package io.dsalgo.array.problems.medium;

import java.util.*;

/**
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 * Explanation: Out of all possible unique triplets possible, [-1,-1,2] and [-1,0,1] satisfy the condition of summing up to zero with i!=j!=k
 * leetcode 15
 */
public class ThreeSum {

    // time: O(n^2) + O(nlog(n)) -> nlog(n) to sort the array
    // space: O(2n) + O(n)
    public static List<List<Integer>> triplet(int[] nums) {
        Set<List<Integer>> st = new HashSet<>(); // this will store all unique triplets

        for (int i = 0; i < nums.length; i++) {
            HashSet<Integer> uniuqeElements = new HashSet<>(); // store the triplets with unique elements
            for (int j = i + 1; j < nums.length; j++) {
                int third = -(nums[i] + nums[j]); // calculate the third element of the triplet

                if (uniuqeElements.contains(third)) {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
                    Arrays.sort(temp.toArray()); // sort the triplet in ascending order
                    st.add(temp); // add the sorted triplet to the set
                }
                uniuqeElements.add(nums[j]); // add the current element to the set
            }
        }
        // convert set to list
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }


    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4};
        int n = arr.length;
        List<List<Integer>> ans = triplet(arr);

        System.out.println(ans);
    }
}
