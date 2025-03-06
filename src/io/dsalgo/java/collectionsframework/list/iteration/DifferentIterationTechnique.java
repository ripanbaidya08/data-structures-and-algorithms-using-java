package io.dsalgo.java.collectionsframework.list.iteration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * There are various ways to traverse the collection elements:
 *
 * By for loop.
 * By for-each loop.
 * By Iterator interface.
 * By ListIterator interface.
 * By forEach() method.
 * By forEachRemaining() method.
 */
public class DifferentIterationTechnique {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        System.out.println("Traversing List through for loop: ");
        for(int i = 0;  i < li.size(); i ++){
            System.out.print(li.get(i)+" ");
        }
        System.out.println();

        System.out.println("Traversing List through  for each loop: ");
        for(int element : li){
            System.out.print(element+ " ");
        }
        System.out.println();

        System.out.println("Traversing List through Iterator: ");
        Iterator<Integer> it = li.iterator();
        while (it.hasNext()){
            int element = it.next();
            System.out.print(element+ " ");
        }
        System.out.println();

        /**
         * Using ListIterator, we can traverse the list in both forward and backward directions.
         * It also allows adding, removing, and modifying elements while iterating in either direction.
         * here we will traverse from the end of the list.
         * before start traversing, make sure your starting index is the last
         */
        System.out.println("Traversing List through ListIterator: ");
        ListIterator<Integer> it2 = li.listIterator(li.size());
        while (it2.hasPrevious()){
            int element = it2.previous();
            System.out.print(element+ " ");
        }
        System.out.println();

        System.out.println("Traversing List through  forEach() method: ");
        li.forEach(element -> System.out.print(element+" ")); // Here, we are using the lambda expression
        System.out.println();

        System.out.println("Traversing list through forEachRemaining() method:");
        Iterator<Integer> itr = li.iterator();
        itr.forEachRemaining(element -> System.out.print(element+ " ")); // Here, we are using the lambda expression
    }
}
