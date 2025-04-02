package io.dsalgo.heap.implementation;

import java.lang.reflect.Array;
import java.util.*;

public class PriorityQueueExample {
    public static void minHeap(){
        Queue<Integer> minHeap = new PriorityQueue<>(); // default is min heap

        // add element - add(), offer()
        minHeap.add(10);
        minHeap.add(5);
        minHeap.offer(3);
        minHeap.offer(2);
        minHeap.add(1);
        minHeap.add(4);

        System.out.println(minHeap);
        // to get to know the top element - peek()
        System.out.println(minHeap.peek());

        // delete element - poll(), remove()
        System.out.println(minHeap.poll()); // delete and returns the top element
        // by default, it deletes the top element and return it. if we never explicitly want to delete a particular element
        // if we give any element to remove, it will delete that element and return true or false. based on the element
        // if present then true, if not present then false
        System.out.println(minHeap.remove());

        System.out.println(minHeap);

        minHeap.offer(34);
        minHeap.offer(8);

        // check empty or not.
        System.out.println("is empty : "+minHeap.isEmpty());

        // does not remove an element, but return the top element
        // when the queue is empty, it will return exception
        System.out.println(minHeap.element());

        System.out.println("size: "+minHeap.size()); // size of the heap

        System.out.println(minHeap.contains(10)); // check element is present or not in the heap and return boolean value true / false

        // return an array of type object
        Object[] array = minHeap.toArray();
        System.out.println(Arrays.toString(array));

        Iterator<Integer> it = minHeap.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+ " ");
        }
        System.out.println();
        // this method will remove all the elements that satisfy the given condition
        // return true or false
        System.out.println(minHeap.removeIf(i -> i % 2 == 0));
        System.out.println(minHeap);
    }
    public static void maxHeap(){
        Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // work as max heap

        // add element - add(), offer()
        maxHeap.offer(10);
        maxHeap.offer(5);
        maxHeap.offer(3);
        maxHeap.offer(2);
        maxHeap.offer(1);
        maxHeap.offer(4);

        System.out.println(maxHeap);
        // to get to know the top element - peek()
        System.out.println(maxHeap.peek());


        // all methods are exactly same as min heap
    }
    public static void main(String[] args) {
//        minHeap();
        maxHeap();
    }
}
