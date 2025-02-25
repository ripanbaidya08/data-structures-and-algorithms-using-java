package io.dsalgo.linkedlist.problems.medium;

import io.dsalgo.linkedlist.implementation.singly.ListNode;

// 19. Remove Nth Node From End of List
class RemoveNthFromEnd {
    public int length(ListNode head){
        int len = 0;
        ListNode temp = head;

        while(temp != null){
            temp = temp.next;
            len ++;
        }
        return len;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head;
        int len = length(head);
        // Whatever node we need to remove.
        // Make sure we have The Access to Previous node of that node.
        if(len == n) {
            ListNode newNode = head.next;
            return newNode;
        }
        int nodeBeforeN = len - n;

        ListNode temp = head;
        for(int i = 0; i < nodeBeforeN-1; i ++){
            temp = temp.next;
        }
        if(temp.next != null) temp.next = temp.next.next;

        return head;
    }
}