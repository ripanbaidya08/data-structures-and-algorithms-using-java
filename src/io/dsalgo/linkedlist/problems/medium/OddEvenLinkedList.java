package io.dsalgo.linkedlist.problems.medium;

import io.dsalgo.linkedlist.implementation.singly.ListNode;

import java.util.ArrayList;
import java.util.List;

// 328. Odd Even Linked List
class OddEvenLinkedList {
    public ListNode brute(ListNode head){
        List<Integer> li = new ArrayList<>();
        ListNode odd = head; ListNode even = head.next;

        while(odd != null && odd.next != null){
            li.add(odd.val);
            odd = odd.next.next;
        }
        if(odd != null) li.add(odd.val);
        
        while(even != null && even.next != null){
            li.add(even.val);
            even = even.next.next;
        }
        if(even != null) li.add(even.val);
        
        ListNode temp = head;
        for(int i = 0; i < li.size(); i ++){
            temp.val = li.get(i);
            temp = temp.next;
        }
        return head;

    }

    public ListNode optimal(ListNode head){
        // 1 -> 2 -> 3 -> 4 -> 5 -> x
        // odd: 1 -> 3 -> 5, even = 2 -> 4
        // connect odd.next to evenHead
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next; 

        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        // connect odd.next with evenHead
        odd.next = evenHead;

        return head;
    }
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode ans = optimal(head);
        
        return ans;
    }
}