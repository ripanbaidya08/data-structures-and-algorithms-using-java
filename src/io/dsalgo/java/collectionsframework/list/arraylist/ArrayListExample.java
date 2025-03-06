package io.dsalgo.java.collectionsframework.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList
        List<Integer> li = new ArrayList<>();
        List<Integer> li2 = new ArrayList<>(); // Another list (currently empty)

        // Adding elements to the list
        li.add(10);
        li.add(20);
        li.add(1, 15); // Add 15 at index 1

        // Removing an element by index
        li.remove(1); // Removes the element at index 1 (15)

        // Adding more elements
        li.add(30);
        li.add(40);

        // Adding all elements from another list (li2 is empty, so no change)
        li.addAll(li2);

        // Display size of the list
        System.out.println("Size of list: " + li.size());

        // Check if the list contains a specific element
        System.out.println("List contains 20: " + li.contains(20));

        // Update an element at a specific index
        li.set(0, 100); // Replaces element at index 0 with 100

        // Get an element at a specific index
        System.out.println("Element at index 2: " + li.get(2));
    }
}
