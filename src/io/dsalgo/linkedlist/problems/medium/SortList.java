package io.dsalgo.linkedlist.problems.medium;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

import io.dsalgo.linkedlist.implementation.singly.ListNode;

// 148. Sort List
class SortList {
    public ListNode brute(ListNode head){
        List<Integer> li = new ArrayList<>();
        ListNode temp = head; 

        while(temp != null){
            li.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(li); //  sort the list
        temp = head;
        
        for(int i = 0; i < li.size(); i ++){
            temp.val = li.get(i);
            temp = temp.next;
        }
        return head;

    }
    public ListNode sortList(ListNode head) {
        ListNode sorted = brute(head);

        return sorted;
    }
}