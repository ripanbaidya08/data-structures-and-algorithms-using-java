package io.dsalgo.java.collectionsframework.set;

import java.util.HashSet;
import java.util.Set;

/**
 * The difference of two sets refers to the elements that are present in one set but not in the other. It is denoted by A - B (or A \ B). <br>
 * If
 * A = {1, 2, 3, 4}
 * B = {3, 4, 5, 6}
 *  <br>
 * Then,
 * A - B = {1, 2} (Elements in A but not in B)
 * B - A = {5, 6} (Elements in B but not in A)
 */
public class SetDifference {
    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        
        setA.add(1); setA.add(2); setA.add(3); setA.add(4);
        setB.add(3); setB.add(4); setB.add(5); setB.add(6);

        // Difference A - B
        Set<Integer> differenceA = new HashSet<>(setA);
        differenceA.removeAll(setB);

        // Difference B - A
        Set<Integer> differenceB = new HashSet<>(setB);
        differenceB.removeAll(setA);

        System.out.println("A - B: " + differenceA); // Output: [1, 2]
        System.out.println("B - A: " + differenceB); // Output: [5, 6]
    }
}
