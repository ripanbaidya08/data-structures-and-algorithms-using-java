package io.dsalgo.heap.problems.easy;

import java.util.PriorityQueue;

// 703. Kth Largest Element in a Stream
class KthLargest {
    // time: O(n log k), space: O(k)
    PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // min-heap <- largest
    int k = 0;
    public KthLargest(int k, int[] nums) {
        for(int i = 0; i < nums.length; i ++){
            minHeap.add(nums[i]);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }
        this.k = k;
    }
    
    public int add(int val) {
        minHeap.add(val);
        
        if(minHeap.size() > k) {
            minHeap.poll();
        }
        return minHeap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */