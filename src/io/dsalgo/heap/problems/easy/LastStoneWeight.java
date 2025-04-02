package io.dsalgo.heap.problems.easy;

import java.util.Collections;
import java.util.PriorityQueue;

// 1046. Last Stone Weight
class LastStoneWeight{
    // time: O(n log n), space: O(n)
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxH = new PriorityQueue<>(Collections.reverseOrder()); // max heap
        for(int stone : stones) {
            maxH.add(stone);
        }

        // x <= y
        while(true){
            if(maxH.size() == 0 || maxH.size() == 1) break;

            int y = maxH.poll(); // first heaviest stone
            int x = maxH.poll(); // second heaviest stone

            if(x != y){
                maxH.add(y-x); // difference of (y-x)
            }
            
        }
        
        return maxH.size() == 0 ? 0 : maxH.peek();
    }
}