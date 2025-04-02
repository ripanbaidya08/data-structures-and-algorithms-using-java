package io.dsalgo.java.collectionsframework.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * 1. Duplicates are not allowed
 * 2. allows null
 * 3. Not synchronized, method are not thread safe
 * 4. unordered collection
 * 5. fast operation.
 */
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // add, remove, clear
        set.add(10); // add an element
        set.add(20);
        set.remove(10); // remove
        set.clear(); // clear

        // check elements
        set.add(30);
        System.out.println(set.contains(30)); // check element is present or not. return boolean
        System.out.println(set.isEmpty()); // check set is empty or not
        System.out.println(set.size());

        System.out.println(set); // Output: [..] (Order may vary)

        // forEach & Iterator
        Set<Integer> numbers = new HashSet<>(Set.of(3, 4, 5, 94, 54));
        for(Integer num : numbers){
            System.out.println(num);
        }

        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        // set operation
        HashSet<Integer> setA = new HashSet<>(Set.of(1, 2, 3, 4));
        HashSet<Integer> setB = new HashSet<>(Set.of(3, 4, 5, 6));

        setA.addAll(setB); // Union
        setA.retainAll(setB); // Intersection
        setA.removeAll(setB); // Difference

        // cloning & converting
        HashSet<Integer> clone = (HashSet<Integer>) set.clone();
        Integer[] arr = set.toArray(new Integer[0]);

        System.out.println(clone);
        System.out.println(Arrays.toString(arr));

        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();


    }
}
