package io.dsalgo.linkedlist.problems.medium;

import io.dsalgo.linkedlist.implementation.singly.ListNode;

// 142. Linked List Cycle
public class LinkedListCycle2 {

    public ListNode startingNodeOfCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // Move by one step ahead
            fast = fast.next.next; // Moving it by two step ahead

            if(slow == fast) {
                // There is a loop
                slow = head; // Set slow to head
                while (slow != fast) {
                    slow = slow.next; // Move slow by one step ahead
                    fast = fast.next; // Move fast by one step ahead
                }
                return slow;
            }
        }
        return null;
    }

}
