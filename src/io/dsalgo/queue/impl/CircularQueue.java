package io.dsalgo.queue.impl;

public class CircularQueue {
    private int maxSize; // Maximum size of the queue
    private int front; // Index of the front element
    private int rear; // Index of the rear element
    private int[] queueArray; // Array to hold the queue elements

    // Constructor to initialize the circular queue with a given size
    public CircularQueue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = -1;
        rear = -1;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return (front == 0 && rear == maxSize - 1) || (front == rear + 1);
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return front == -1;
    }

    // Method to add an element to the circular queue
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        if (isEmpty()) {
            front = 0; // First element added
            rear = 0;
        } else {
            rear = (rear + 1) % maxSize; // Circular increment
        }
        queueArray[rear] = item; // Add item to the queue
    }

    // Method to remove an element from the circular queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Indicate that the queue is empty
        }
        int item = queueArray[front]; // Get the front item
        if (front == rear) { // Queue has only one element
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % maxSize; // Circular increment
        }
        return item; // Return dequeued item
    }

    // Method to display elements in the circular queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Elements in Circular Queue: ");
        int temp = front;
        while(temp <= rear){
            System.out.print(queueArray[temp]+" ");
            temp = (temp+1)%maxSize;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        CircularQueue queue = new CircularQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.display();

        int dequeuedItem = queue.dequeue();
        System.out.println("Dequeued item: " + dequeuedItem);

        queue.display();
    }
}