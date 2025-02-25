package io.dsalgo.linkedlist.problems.easy;

import io.dsalgo.linkedlist.implementation.singly.ListNode;

/**
 * check whether a given element is present or not in the linked list.
 * return true if present or else false.
 */
public class SearchInLinkedList {

    public boolean searchKey(ListNode head, int key) {
        // take a current node, so that later we have the access to head
        ListNode cur = head;

        while(cur != null) {
            if(cur.val == key)  return true;
            cur = cur.next;
        }
        // time: O(n)
        // element not found
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 3};

        ListNode head = new ListNode(arr[0]);
        head.next = new ListNode(arr[1]);
        head.next.next = new ListNode(arr[2]);

        int key = 39;

        boolean isPresent = new SearchInLinkedList().searchKey(head, key);
        System.out.println(isPresent);
    }
}
