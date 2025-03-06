package io.dsalgo.java.collectionsframework.list.iteration;

import java.util.*;

/**
 * ListIterator is used to iterate through a list in both forward and backward directions.
 * While traversing, we can add, remove, or update elements in the list.
  */
public class ListIteratorExample1 {
    public static void main(String args[]) {
        List<String> al = new ArrayList<String>();
        al.add("Amit");
        al.add("Vijay");
        al.add("Kumar");
        al.add(1, "Sachin");
        ListIterator<String> itr = al.listIterator();
        System.out.println("Traversing elements in forward direction");
        while (itr.hasNext()) {

            System.out.println("index:" + itr.nextIndex() + " value:" + itr.next());
        }
        System.out.println("Traversing elements in backward direction");
        while (itr.hasPrevious()) {

            System.out.println("index:" + itr.previousIndex() + " value:" + itr.previous());
        }
    }
}  