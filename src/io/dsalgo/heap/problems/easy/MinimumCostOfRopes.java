package io.dsalgo.heap.problems.easy;

import java.util.PriorityQueue;

// Minimum Cost of ropes
class MinimumCostOfRopes {
    // Function to return the minimum cost of connecting the ropes.
    public int minCost(int[] arr) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num : arr){
            minHeap.add(num);
        }
        
        int miniCost = 0; // result
        
        while(true){
            if(minHeap.size() == 1){
                break;
            } 
            
            int first = minHeap.poll();
            int second = minHeap.poll();
            
            miniCost += (first + second);
            
            minHeap.add(first + second);
        }
        return miniCost;
    }
}