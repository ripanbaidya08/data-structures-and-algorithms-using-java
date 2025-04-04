package io.dsalgo.heap.problems.medium;

import java.util.PriorityQueue;

// 215. Kth Largest Element in an Array
class KthLargestElementInAnArray {
    // largest: min-heap
    // time: O(n log k), space: O(k)
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < nums.length; i ++){
            pq.add(nums[i]);
            if(pq.size() > k) pq.poll();
        }
        return pq.peek(); // O(1)
    }
}