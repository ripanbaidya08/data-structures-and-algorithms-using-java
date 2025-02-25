package io.dsalgo.linkedlist.problems.easy;

import io.dsalgo.linkedlist.implementation.singly.ListNode;

public class LengthOfCycleInLinkedList {
    public static int lengthOfLoop(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        int length = 0;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            // there is cycle in LL
            if(slow == fast){
                ListNode front = fast.next;
                length = 1;
                while(front != fast){
                    front = front.next;
                    length++;
                }
                return length;
            }
        }
        return 0;
    }
}
