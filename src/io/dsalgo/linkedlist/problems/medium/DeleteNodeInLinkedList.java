package io.dsalgo.linkedlist.problems.medium;

import io.dsalgo.linkedlist.implementation.singly.ListNode;

// 237. Delete Node in a Linked List
class DeleteNodeInLinkedList {
    public void deleteNode(ListNode node) {
        
        node.val = node.next.val;
        node.next = node.next.next;
    }
}