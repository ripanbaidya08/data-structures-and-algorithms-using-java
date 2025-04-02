package io.dsalgo.java.collectionsframework.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<Integer> aq = new ArrayDeque<>();

        aq.add(10);
        aq.addFirst(30);

        System.out.println(aq.removeFirst());

        System.out.println("size :"+aq.size());

        System.out.println(aq.contains(20));

        aq.push(20);

        System.out.println("pop() "+aq.pop());

        System.out.println(aq.peek());
        System.out.println(aq.peekFirst());
        System.out.println(aq.peekLast());

        System.out.println("element :" + aq.element()); // return the head of the queue

        aq.add(20);
        aq.add(25);
        System.out.println("aq = " + aq);
        aq.removeIf(el -> el % 2 == 0);

        System.out.println("aq = " + aq);
    }
}
