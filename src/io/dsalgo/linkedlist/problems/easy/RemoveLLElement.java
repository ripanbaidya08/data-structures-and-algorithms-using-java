package io.dsalgo.linkedlist.problems.easy;


import io.dsalgo.linkedlist.implementation.singly.ListNode;

//203. Remove Linked List Elements
public class RemoveLLElement {

    public ListNode removeElements(ListNode head, int val) {
        // initially: head -> 1 -> 2 -> 3 -> 2 -> 5 -> null
        // val = 2

        // Create a Dummy Node with value 0
        ListNode dummyNode = new ListNode(0);  // 0 -> null
        dummyNode.next = head; // head -> 0 -> 1 -> 2 -> 3 -> 2 -> 5 -> null

        ListNode current = dummyNode;

        while(current.next != null){
            if(current.next.val == val){
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return dummyNode.next;
    }
}
