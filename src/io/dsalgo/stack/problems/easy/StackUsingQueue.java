package io.dsalgo.stack.problems.easy;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    static class StackQ{
        Queue<Integer> queue = new LinkedList<>();

        public void push(int data){
            queue.offer(data);

            // shift all the elements, from first to before last element we have added right now.
            for(int i = 1; i <= queue.size()-1; i ++){
                queue.offer(queue.poll());
            }
        }

        public int pop(){
            if(queue.isEmpty()){
                return -1;
            }
            return queue.poll();
        }
        public int peek(){
            if(queue.isEmpty()){
                return -1;
            }
            return queue.peek();
        }
        public int getSize(){
            return queue.size();
        }
    }
    public static void main(String[] args) {
        StackQ stack = new StackQ();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("current size: "+stack.getSize());
        System.out.println("current peek: "+stack.peek());
        System.out.println("pooped value: "+stack.pop());
        System.out.println("current size: "+stack.getSize());
        System.out.println("current peek: "+stack.peek());
        System.out.println("pooped value: "+stack.pop());
    }
}
