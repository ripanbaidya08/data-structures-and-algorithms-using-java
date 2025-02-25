package io.dsalgo.queue.impl;

import java.util.Stack;

/**
 * Queue follow FIFO principle, while the stack follows LIFO principle
 * Here, we will use two stacks to implement the queue
 */
class QueueS{
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    /**
     * It associated with 3 steps.
     * 1. Put all the elements of st1 to st2
     * 2. Put the data to st1
     * 3. Put all the elements of st2 to st1
     * @param data
     */
    public void push(int data){
        // step1
        while(!st1.empty()){
            st2.push(st1.pop());
        }
        // step2
        st1.push(data);

        // step3
        while(!st2.empty()){
            st1.push(st2.pop());
        }
        // time: O(2n)
    }

    public int pop(){
        // time : O(1)
        if(st1.empty())
            return -1;
        return st1.pop();
    }

    public int peek(){
        // time : O(1)
        if(st1.empty())
            return -1;
        return st1.peek();
    }

    public int getSize(){
        return st1.size();
    }
}
public class QueueUsingStack {
    public static void main(String[] args) {
        QueueS q = new QueueS();
        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
        q.push(50);
        System.out.println("current size: "+q.getSize());
        System.out.println("current peek: "+q.peek());
        System.out.println("pooped value: "+q.pop());
        System.out.println("current size: "+q.getSize());
        System.out.println("current peek: "+q.peek());
        System.out.println("pooped value: "+q.pop());
    }
}
