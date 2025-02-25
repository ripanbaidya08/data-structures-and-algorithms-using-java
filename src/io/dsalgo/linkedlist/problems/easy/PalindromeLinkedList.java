package io.dsalgo.linkedlist.problems.easy;

import io.dsalgo.linkedlist.implementation.singly.ListNode;

// 234. Palindrome Linked List
class PalindromeLinkedList {
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode temp = head; 

        while(temp != null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    public ListNode middleNode(ListNode head){
        ListNode slow = head; 
        ListNode fast = head; 

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // middle of the list.
    }

    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        
        ListNode middle = middleNode(head);
        ListNode reversedSecondHalf = reverse(middle);  
        ListNode firstHalf = head;

        boolean isPalindrome = true;
        while(reversedSecondHalf != null){
            if(reversedSecondHalf.val != firstHalf.val){
                isPalindrome = false;
                break;
            }
            reversedSecondHalf = reversedSecondHalf.next;
            firstHalf = firstHalf.next;
        }
        return isPalindrome;
    }
}