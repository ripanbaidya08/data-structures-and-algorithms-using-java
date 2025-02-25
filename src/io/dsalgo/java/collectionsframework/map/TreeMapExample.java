package io.dsalgo.java.collectionsframework.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<Integer, String> evenNumbers = new TreeMap<>();
        evenNumbers.put(2, "Two");
        evenNumbers.put(1, "One");
        evenNumbers.put(4, "Four");

        System.out.println(evenNumbers);

        evenNumbers.putIfAbsent(2, "Two");
        System.out.println(evenNumbers);

        evenNumbers.replaceAll((k, v)-> v.toUpperCase());
    }
}
