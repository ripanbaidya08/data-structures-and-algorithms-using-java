package io.dsalgo.java.collectionsframework.set;

import java.util.HashSet;
import java.util.Set;

/**
 * The union of two sets refers to a set that contains all unique elements from both sets. It is denoted by A ∪ B.<br>
 * If
 * A = {1, 2, 3, 4}
 * B = {3, 4, 5, 6}
 * <br>
 * Then,
 * A ∪ B = {1, 2, 3, 4, 5, 6} (All elements from both sets, duplicates removed)
 */
public class SetUnion {
    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        
        setA.add(1); setA.add(2); setA.add(3); setA.add(4);
        setB.add(3); setB.add(4); setB.add(5); setB.add(6);

        // Union operation
        Set<Integer> unionSet = new HashSet<>(setA);
        unionSet.addAll(setB);

        System.out.println("Union: " + unionSet); // Output: [1, 2, 3, 4, 5, 6]
    }
}
