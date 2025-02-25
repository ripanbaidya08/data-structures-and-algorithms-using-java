package io.dsalgo.queue.impl;
/**
 * Queue: Follows First-In-First-Out (FIFO) order.
 * push(): adds an element to the end of the queue
 * pop(): removes an element from the front of the queue
 * peek(): returns the element at the front of the queue without removing it
 * size(): returns the number of elements in the queue
 *
 * Pointers:
 * Front: points to the front of the queue (deletion happens here)
 * Rear: points to the end of the queue (insertion happens here)
 * */
class Queue{
    private int[] arr;
    private int length, currSize, front, rear;

    public Queue(int length){
        this.length = length;
        arr = new int[length];
        front = rear = -1;
        currSize = 0;
    }
    // Implementaion of push operation
    public void push(int data){
        if(currSize == length){
            System.out.println("Queue is Full");
            System.exit(1);
        }
        // Initially, There is no element in the Queue. and we are inserting element into the Queue.
        // Front & Rear need to point to the first place of the array.
        if (currSize == 0){
            front = rear = 0;
        } else {
            rear = (rear + 1) % length;
        }
        arr[rear] = data;
        System.out.println("Element "+data+" Inserted Succesfully.");
        currSize ++;
    }

    // Implementation of Pop
    public int pop(){
        if(currSize == 0) {
            System.out.println("Queue is Empty.");
            return -1;
        }
        int poopedValue = arr[front]; // Store the value
        if(currSize == 1){  // Make sure, front & rear point to the -1
            front = rear = -1;
        } else {
            front = (front+1)%length;
        }
        currSize --;
        return poopedValue;
    }

    public int peek(){
        if(currSize == 0) {
            System.out.println("Queue is Empty.");
            return -1;
        }
        return arr[front];
    }
    public int size(){
        return currSize;
    }
}
public class ImplementQueueUsingArray {
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.push(10);
        q.push(20);
        q.push(30);

        System.out.println(q.peek());
        System.out.println(q.pop());
        System.out.println(q.pop());
    }
}
