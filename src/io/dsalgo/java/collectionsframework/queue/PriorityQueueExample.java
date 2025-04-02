package io.dsalgo.java.collectionsframework.queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> min_heap = new PriorityQueue<>(); // default min-heap
        PriorityQueue<Integer> max_heap = new PriorityQueue<>(Collections.reverseOrder()); // default max-heap

        min_heap.add(10);
        min_heap.add(20);
        min_heap.add(30);

        // Display elements
        System.out.println("Elements is min heap :"+min_heap);

        // peek element
        System.out.println("top element :"+ min_heap.peek());

        // Remove element
        System.out.println("Remove 10 :"+min_heap.remove(10));

        System.out.println("size of min_heap :"+min_heap.size());

        System.out.println("does min heap contains 20 :"+ min_heap.contains(20));

        max_heap.add(10);
        max_heap.add(20);
        max_heap.add(30);

        // Display elements
        System.out.println("Elements is min heap :"+max_heap);

        // peek element
        System.out.println("top element :"+ max_heap.peek());

        // Remove element
        System.out.println("Remove 10 :"+max_heap.remove(10));

        System.out.println("size of min_heap :"+max_heap.size());

        System.out.println("does min heap contains 20 :"+ max_heap.contains(20));
    }
}
