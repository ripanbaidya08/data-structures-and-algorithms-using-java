package io.dsalgo.linkedlist.implementation.singly;

/**
 * In this class we will implement the linked list
 * Implement all the methods to add and delete elements from the linked list
 */
public class ListNode {
    public int val; // val or value of the linked list
    public ListNode next; // next, pointer to the next node

    public ListNode(int val) {
        this.val = val;
    }
    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
