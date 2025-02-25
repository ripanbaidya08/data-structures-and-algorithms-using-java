package io.dsalgo.linkedlist.problems.medium;

import io.dsalgo.linkedlist.implementation.doubly.ListNode;

import java.util.Stack;

public class ReverseDoublyLinkedList {

    public ListNode reverse(ListNode head) {
        // we can use stack val structure in order to reverse the linked list
        // we will change the element of node
        Stack<Integer> st = new Stack<>();

        ListNode temp = head;
        // first we will push all the element, inside stack
        // it follow, LIFO principle
        while(temp != null){
            st.push(temp.val);
            temp = temp.next;
        }
        temp = head;
        while (temp != null){
            temp.val = st.peek(); // whatever the top element, assign it to first node
            st.pop(); // remove the top
            temp = temp.next;
        }

        return head;
    }

}
