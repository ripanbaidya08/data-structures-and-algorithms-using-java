package io.dsalgo.heap.problems.medium;

import java.util.PriorityQueue;

// 912. Sort an Array
class SortAnArray {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i = 0; i < nums.length; i ++){
            minHeap.add(nums[i]);
        }
        int j = 0;
        while(minHeap.size() != 0){
            nums[j++] = minHeap.poll();
        }
        return nums;
    }
}