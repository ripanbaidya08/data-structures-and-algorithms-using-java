package io.dsalgo.linkedlist.problems.medium;

import io.dsalgo.linkedlist.implementation.singly.ListNode;

class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy; // This will point to the newly added element
        int carry = 0; 

        while(l1 != null || l2 != null || carry == 1){
            int sum = 0;

            // add element from l1
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            // add element from l2
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            // add the carry with the current sum
            sum += carry;
            carry = sum / 10;

            // Create a new Node to store the sum result
            ListNode newNode = new ListNode(sum % 10);
            cur.next = newNode;
            cur = cur.next;
        }
        return dummy.next; 
    }
}