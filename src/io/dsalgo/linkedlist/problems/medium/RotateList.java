package io.dsalgo.linkedlist.problems.medium;

import io.dsalgo.linkedlist.implementation.singly.ListNode;

// 61. Rotate List
class RotateList {
    public int length(ListNode head){
        int len = 0 ;  
        while(head != null){
            len ++ ;
            head = head.next ;
        }
        return len ; 
    }
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head ;
        ListNode tailNode = null ;
        ListNode newNode = null ;
        int len = length(head);

        if(head == null || k == 0 )
            return head ;


        k = k % len ;

        if(k == 0)
            return head;

        // we will go upto the (len - k) node so that getting newNode and tailNode become easy
        int target = len - k;

        while(temp != null){
            target --;
            if(target == 0)
                break ;
            temp = temp.next ;
        }
        tailNode = temp;
        newNode = temp.next ;
        tailNode.next = null ;

        temp = newNode;

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head; 
        
        return newNode;

    }
}