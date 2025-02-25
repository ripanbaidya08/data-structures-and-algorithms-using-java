package io.dsalgo.java.collectionsframework.set;

import java.util.HashSet;
import java.util.Set;

/**
 * A subset is a set where all elements of one set are contained within another set.<br>
 * It is denoted as A ⊆ B, meaning A is a subset of B if every element of A is also in B. <br>
 * If
 * A = {1, 2, 3}
 * B = {1, 2, 3, 4, 5}
 * <br>
 * Then, A ⊆ B because all elements of A are in B.
 */
public class SubsetCheck {
    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        
        setA.add(1); setA.add(2); setA.add(3);
        setB.add(1); setB.add(2); setB.add(3); setB.add(4); setB.add(5);

        // Checking if A is a subset of B
        boolean isSubset = setB.containsAll(setA);

        System.out.println("Is A a subset of B? " + isSubset); // Output: true
    }
}
