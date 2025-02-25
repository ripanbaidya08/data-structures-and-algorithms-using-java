package io.dsalgo.linkedlist.problems.easy;

import io.dsalgo.linkedlist.implementation.singly.ListNode;

// 83. Remove Duplicates from Sorted List
class RemoveDuplicatesFromSortedList {
        public ListNode deleteDuplicates(ListNode head) {

        if(head == null) return null ; 
        
        ListNode firstNode = head; 
        ListNode secondNode = head ; 
        
        while(secondNode != null ){
            if(firstNode.val != secondNode.val){
                firstNode.next = secondNode;
                firstNode = secondNode ;
            }else {
                secondNode = secondNode.next ;
            }
        }
        firstNode.next = null ; 
        return head ;
    }
}