package io.dsalgo.java.collectionsframework.set;

import java.util.HashSet;
import java.util.Set;

/**
 * the intersection of two sets refers to the elements that are common to both sets. It is denoted by the symbol ∩. <br>
 * If
 * A = {1, 2, 3, 4}
 * B = {3, 4, 5, 6}
 * <br>
 * Then,
 * A ∩ B = {3, 4}
 */
public class SetIntersection {
    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        
        setA.add(1); setA.add(2); setA.add(3); setA.add(4);
        setB.add(3); setB.add(4); setB.add(5); setB.add(6);

        setA.retainAll(setB); // Intersection operation

        System.out.println("Intersection: " + setA); // Output: [3, 4]
    }
}
