package io.dsalgo.linkedlist.problems.easy;

import io.dsalgo.linkedlist.implementation.singly.ListNode;

// 160. Intersection of Two Linked Lists
public class IntersectionOfTwoLinkedList {
    public static int length(ListNode head){
        int len = 0; 
        while(head != null) {
            len ++;
            head = head.next;
        }
        return len;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode pointerA = headA;
        ListNode pointerB = headB;

        while (pointerA != pointerB) {
            // If we reach the end of one list, switch to the other list
            pointerA = (pointerA == null) ? headB : pointerA.next;
            pointerB = (pointerB == null) ? headA : pointerB.next;
        }

        // Either both are null (no intersection) or they meet at the intersection node
        return pointerA;
    }
}