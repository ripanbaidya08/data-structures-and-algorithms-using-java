package io.dsalgo.linkedlist.problems.medium;

import io.dsalgo.linkedlist.implementation.singly.ListNode;

// 86. Partition List
class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode smaller = new ListNode(1); // store all the value which strictly lesser than x
        ListNode greater = new ListNode(2); // store all the value which is >= x

        ListNode tempA = smaller ; 
        ListNode tempB = greater ; 

        ListNode temp = head; 

        while(temp != null){
            if(temp.val < x){
                // val < x
                tempA.next = temp;
                tempA = tempA.next ; 
            } else {
                // val >= x
                tempB.next = temp ; 
                tempB = tempB.next ; 
            }
            temp = temp.next ; 
        }

        tempB.next = null ; 
        tempA.next = greater.next ; 

        return smaller.next ;        
    }
}