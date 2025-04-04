package io.dsalgo.linkedlist.problems.medium;

import io.dsalgo.linkedlist.implementation.singly.ListNode;

// 2095. Delete the Middle Node of a Linked List
class DeleteMiddleNode {
    public ListNode deleteMiddle(ListNode head) {
        ListNode dummy = new ListNode(0, head); // Create a dummyNode, which points to head initially
        ListNode slow = dummy; // Assign the dummy to slow
        ListNode fast = head; 

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next; 
        }
        // Slow will stop at the Node before the middle node
        // that needs to be deleted
        slow.next = slow.next.next;

        return dummy.next;
    }
}