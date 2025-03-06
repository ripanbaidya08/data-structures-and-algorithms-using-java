package io.dsalgo.java.collectionsframework.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Iterator(I)
 * Iterator interface provides the facility of iterating the elements in a forward direction only.
 * It has only Three methods.
 * 1. public boolean hasNext() - It returns true if the iterator has more elements otherwise it returns false
 * 2. public Object next() - It returns the element and moves the cursor pointer to the next element.
 * 3. public void remove() - It removes the last elements returned by the iterator. It is less used.
 */
public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        /**
         * Here, I have a list of integer elements
         * I want to remove all the element from the list which are even while Iteration.
         * Here, I have used Iterator(I) and will use remove() method for deletion of the all even numbers.
         */
        li.add(5); li.add(10); li.add(15); li.add(20); li.add(25); li.add(30);

        System.out.println("Before Deletion: "+li);

        // Create an Iterator
        Iterator<Integer> it = li.iterator();
        while(it.hasNext()){
            int element = it.next();
            if(element % 2 == 0){
                it.remove(); // Remove if, even an element
            }
        }

        System.out.println("After Deletion: "+li);
    }
}
