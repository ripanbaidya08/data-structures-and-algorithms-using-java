package io.dsalgo.linkedlist.problems.easy;

import io.dsalgo.linkedlist.implementation.singly.ListNode;

//206. Reverse Linked List
public class ReverseLinkedList {

    public ListNode iterative(ListNode head){
        ListNode prev = null;
        ListNode temp = head;

        while(temp != null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    public ListNode recursive(ListNode head){
        if(head == null || head.next == null) return head;

        ListNode newHeadNode = recursive(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;

        return newHeadNode;
    }


    public ListNode reverseList(ListNode head) {
        // ListNode ans = iterative(head);
        ListNode ans = recursive(head);
        return ans;
    }
}
