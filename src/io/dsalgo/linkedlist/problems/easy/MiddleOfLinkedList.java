package io.dsalgo.linkedlist.problems.easy;

import io.dsalgo.linkedlist.implementation.singly.ListNode;

//876. Middle of the Linked List
public class MiddleOfLinkedList {
    public ListNode brute(ListNode head){
        ListNode temp = head;
        int length = 0;
        // Count the length
        while(temp != null){
            length ++;
            temp = temp.next;
        }
        int middleNode = length/2;
        // 3 5 2 1 5
        temp = head;
        for(int i = 0; i < middleNode; i ++){
            temp = temp.next;
        }
        return temp;
    }
    public ListNode middleNode(ListNode head) {
        /**
         * We can use Slow & Fast pointer to solve this problem
         * increse the slow pointer by one time, while the fast ptr 2 times
         * for odd len - fast will stop at last element
         * for even len - fast will stop at null.
         * return slow
         */
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
