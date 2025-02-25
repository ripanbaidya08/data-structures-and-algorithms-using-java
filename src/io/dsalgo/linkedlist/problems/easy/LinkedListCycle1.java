package io.dsalgo.linkedlist.problems.easy;

import io.dsalgo.linkedlist.implementation.singly.ListNode;

import java.util.HashMap;
import java.util.Map;

// 141. Linked List Cycle
public class LinkedListCycle1 {
    public boolean brute(ListNode head){
        /**
         * We can Use Hashing to detect loop in linked list.
         * Whatever the element we have encounter before, if we encounter
         * the same element twice, then there is a loop. and return false.
         * TC: O(n)
         */
        Map<ListNode, Integer> mp = new HashMap<>();
        ListNode temp = head;

        // Here,(temp != null) beacuse it might happen LinkedList
        // Doesn't contains any loop.
        while(temp != null){
            // Checking if ListNode is already in HashMap
            if(mp.containsKey(temp)) return true; // There is a loop

            // put<K, V>
            mp.put(temp, 1);
            temp = temp.next;
        }
        return false; // If there is no Loop
    }

    public boolean optimal(ListNode head){
        /**
         * We will use Fast & Slow pointer approach
         * Moving the slow by one step, while fast by two step.
         * If, there is a loop then, after a Couple of Rotation.
         * They would meet at the same position.
         */
        ListNode slow = head; ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; // Move by one step ahead
            fast = fast.next.next; // Moving it by two step ahead

            if(slow == fast) return true; // There is a loop
        }
        return false;
    }
    public boolean hasCycle(ListNode head) {
        boolean result = optimal(head);

        return result;
    }
}
