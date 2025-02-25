package io.dsalgo.linkedlist.problems.easy;

import io.dsalgo.linkedlist.implementation.doubly.ListNode;

public class ConvertArrayToDoublyLinkedList {

    // display the linked list
    public static void print(ListNode head){
        ListNode cur = head;
        while(cur != null){
            System.out.print(cur+" ");
            cur = cur.next;
        }
    }

    public static ListNode convertArrToDLL(int[] arr){
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;
        for(int i = 1; i < arr.length; i ++){
            ListNode newNode = new ListNode(arr[i]);
            temp.next = newNode;
            newNode.prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 6};
        ListNode head = convertArrToDLL(arr);
        print(head);
    }
}
