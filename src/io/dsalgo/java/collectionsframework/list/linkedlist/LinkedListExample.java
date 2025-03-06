package io.dsalgo.java.collectionsframework.list.linkedlist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        // Adding elements using different methods
        ll.add(10);
        ll.offer(20); // add an element at the end
        ll.add(1, 15); // add element at specific index
        ll.addFirst(19); // add at first
        ll.addLast(234); // add at last
        ll.push(434); // add an element at the top

        // Remove element using different methods
        ll.remove();
        ll.remove(3); // remove element at specific index
//        ll.remove(obj);
        ll.removeFirstOccurrence(53);
        ll.removeLastOccurrence(343);
        ll.poll();
        ll.pollFirst();
        ll.pollLast();
        ll.pop();
        ll.removeIf(el -> el > 34); // remove if this condition satisfies

        // set element at specific index
        ll.set(3, 10);

        // peek
        System.out.println(ll.peek());
        System.out.println(ll.peekFirst());
        System.out.println(ll.peekLast());

        // get an element
        ll.get(1); // get elment where are at any specific index
        ll.getFirst();
        ll.getLast();

        // size
        System.out.println(ll.size());

        // contains
        System.out.println(ll.contains(34)); // check whether ll contains this or not

        // empty or not
        System.out.println(ll.isEmpty());

        // element
        System.out.println(ll.element());

        // toArray()
        Object[] array = ll.toArray();

        // index of
        System.out.println(ll.indexOf(29));
        System.out.println(ll.lastIndexOf(29));

        LinkedList<Integer> ll2 = new LinkedList<>(List.of(1, 2,3 ));

        // add all
        ll.addAll(ll2);

        // remove all
        ll.removeAll(ll2);

        // retain all
        ll.retainAll(ll2);

        // clear
        ll.clear();

        Iterator<Integer> descIt = ll2.descendingIterator();
        while (descIt.hasNext()){
            System.out.println(descIt.next());
        }
    }
}
