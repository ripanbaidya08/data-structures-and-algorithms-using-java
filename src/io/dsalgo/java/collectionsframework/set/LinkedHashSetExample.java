package io.dsalgo.java.collectionsframework.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Java LinkedHashSet class is a Hashtable and Linked list implementation of the Set interface.
 * It inherits the HashSet class and implements the Set interface.
 *
 * Methods Used is LinkedHashSet are more or less similar
 */
public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Creating LinkedHashSet
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        Set<Integer> st = new LinkedHashSet<>();
        // Adding elements
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10); // Duplicate element is not allowed

        // Displaying elements
        System.out.println(set);

        // Removing elements
        set.remove(10); // 10 would be deleted if it is present in the set. and will return true. or else return false
        /**
         * public E removeFirst()
         * public E removeLast()
         * If there is no element to be removed, then it will throw NoSuchElementException
         */

        // get the First and Last element
        System.out.println(set.getFirst());
        System.out.println(set.getLast());

        // size
        System.out.println("size: "+set.size());

        // Check whether an element is present or not
        System.out.println(set.contains(10)); // return true or false

        // Display all element
        set.forEach(el -> System.out.print(el+" "));
        System.out.println();

        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();

        // clear all elements
        set.clear();
    }
}
