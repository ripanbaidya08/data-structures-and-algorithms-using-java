package io.dsalgo.linkedlist.problems.hard;

import io.dsalgo.linkedlist.implementation.singly.ListNode;

import java.util.PriorityQueue;
import java.util.Queue;

// 23. Merge k Sorted Lists
class MergeKSortedList {
  public ListNode mergeKLists(ListNode[] lists) {
    ListNode dummy = new ListNode(0);
    ListNode curr = dummy;
    Queue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

    for (final ListNode list : lists)
      if (list != null)
        minHeap.offer(list);

    while (!minHeap.isEmpty()) {
      ListNode minNode = minHeap.poll();
      if (minNode.next != null)
        minHeap.offer(minNode.next);
      curr.next = minNode;
      curr = curr.next;
    }

    return dummy.next;
  }
}