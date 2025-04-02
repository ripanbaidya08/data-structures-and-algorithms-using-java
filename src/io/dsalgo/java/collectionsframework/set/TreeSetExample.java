package io.dsalgo.java.collectionsframework.set;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        // add elements
        ts.add(10); ts.add(25);
        ts.add(20); ts.add(30);

        ts.add(45); ts.add(50);
        ts.add(40); ts.add(55);

        System.out.println("Elements: "+ts);

        // remove elements
        System.out.println("Remove 20: "+ ts.remove(20)); // true if an element exists, or else false

        // size
        System.out.println("size : "+ts.size());

        // contains
        System.out.println("Does treeSet Contains 20 :"+ts.contains(20)); // true if contains or else false

        // headSet(): This method will return elements of TreeSet which are less than the specified element.
        SortedSet<Integer> headSet = ts.headSet(40);
        System.out.println("headSet() :"+headSet);

        // tailSet(): This method will return elements of TreeSet which are greater than or equal to the specified element.
        SortedSet<Integer> tailSet = ts.headSet(40);
        System.out.println("tailSet() :"+tailSet);

        // first(): return the first element or the smallest element
        System.out.println("First element :"+ts.first());

        // last(): return the last element or the greatest element
        System.out.println("last element :"+ts.last());

        // ceiling(): returns the least element in this set greater than or equal to the given element, or null if there is no such element.
        System.out.println("ceiling(): "+ts.ceiling(20));

        // floor(): returns the greatest element in this set less than or equal to the given element, or null if there is no such element.
        System.out.println("floor(): "+ts.floor(35));

        // pollFirst(): return and remove the first element or the smallest element
        System.out.println("pollFirst() :"+ts.pollFirst());

        // pollFirst(): return and remove the last element or the greatest element
        System.out.println("pollFirst() :"+ts.pollLast());

        // Print all the elements
        ts.forEach(el -> System.out.print(el+" "));

        // Iterate through TreeSet
        Iterator<Integer> descIterator = ts.descendingIterator(); // Iterate in Descending order
        while (descIterator.hasNext()){
            System.out.print(descIterator.next()+" ");
        }
        Iterator<Integer> ascIterator = ts.iterator(); // Iterate in Descending order
        while (ascIterator.hasNext()){
            System.out.print(ascIterator.next()+ " ");
        }

        // clear
        ts.clear();

        System.out.println("Current size of the TreeSet : " + ts.size());
    }
}
