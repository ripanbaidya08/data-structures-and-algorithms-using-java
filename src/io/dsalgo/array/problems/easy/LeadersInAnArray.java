package io.dsalgo.array.problems.easy;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Input : arr = [4, 7, 1, 0]
 * Output = 7 1 0
 * Explanation: Rightmost element is always a leader. 7 and 1 are greater than the elements in their right side.
 */
public class LeadersInAnArray {
    public static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;

        int leader = arr[n-1];
        ans.add(leader); // last element always leader

        for(int i = n-2; i >= 0; i --){
            // looking for the element that is larger than current leader
            // if found then add and update the leader
            if(arr[i] >= leader){
                ans.add(arr[i]);
                leader = arr[i];
            }
        }
        Collections.reverse(ans);
        // O(n)+O(nlogn)
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 0};
        ArrayList<Integer> ans = leaders(arr);
        System.out.println(ans);
    }
}
