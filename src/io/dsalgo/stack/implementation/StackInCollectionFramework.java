package io.dsalgo.stack.implementation;

import java.util.Iterator;
import java.util.Stack;

/**
 * Stack follow LIFO principle
 * means last in first out
 * Commonly used methods in stacks are
 * push(), pop(), peek() and more
 */
public class StackInCollectionFramework {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        // push an element
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        // display stack
        System.out.println(st);

        // pop the top element
        System.out.println("pooped element: "+st.pop());

        // peek element
        System.out.println("peek element: "+st.peek());

        // size
        System.out.println("size: "+st.size());

        // empty or not,
        // we can either use isEmpty() or empty()
        System.out.println("is empty: "+st.empty());


        System.out.println(st);
        // search object
        // return -1 if not found. if found return distance from the top of the stack.
        // 1 based indexing
        System.out.println("search 20: "+ st.search(20));


        // print elements of the stack using Iterator
        Iterator<Integer> it = st.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
