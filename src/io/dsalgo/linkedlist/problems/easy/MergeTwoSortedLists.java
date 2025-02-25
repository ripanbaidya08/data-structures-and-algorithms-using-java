package io.dsalgo.linkedlist.problems.easy;

import io.dsalgo.linkedlist.implementation.singly.ListNode;

// 21. Merge Two Sorted Lists
class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode dummy = new ListNode(-1); // we can initialize our dummy node with any value
        ListNode temp = dummy ; 

        ListNode i = list1 ; 
        ListNode j = list2 ; 

        while(i != null && j != null){
            if(i.val <= j.val){
                temp.next = i ;
                i = i.next;
            } else {
                // i.val > j.val
                temp.next = j ; 
                j = j.next;
            }
            temp = temp.next ;
        }
        // if any list becomes empty
        // this will manage all edge case 
        if(i == null){
            temp.next = j ;
        } else {
            temp.next = i;
        }

        return dummy.next; 
    }
}