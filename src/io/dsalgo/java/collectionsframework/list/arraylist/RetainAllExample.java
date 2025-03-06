package io.dsalgo.java.collectionsframework.list.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * The retainAll() method in Java's ArrayList is used to retain only the elements that are present in another collection.
 * It removes all elements that are not in the specified collection
 */
public class RetainAllExample {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        List<Integer> list2 = new ArrayList<>(List.of(2, 4, 6, 8));

        // Retain only the elements that are present in list2
        list1.retainAll(list2);

        System.out.println("Updated list1 after retainAll(): " + list1); // [2, 4, 6]
        /**
         * list1 initially contains [1, 2, 3, 4, 5, 6].
         * list2 contains [2, 4, 6, 8].
         * list1.retainAll(list2) removes all elements from list1 that are not in list2, so 1, 3, 5 are removed.
         * The final list1 contains [2, 4, 6], which are the elements present in both lists.
         */
    }
}
