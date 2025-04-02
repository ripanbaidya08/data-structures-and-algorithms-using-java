package io.dsalgo.java.collectionsframework.map;

import java.util.Hashtable;

/**
 * HashMap doesn’t provide any Enumeration, while Hashtable provides not fail-fast Enumeration.
 * The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.
 * It is similar to HashMap, but is synchronized.
 * Hashtable stores key/value pair in hash table.
 */
public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<String , Integer> ht = new Hashtable<>(); // DefaultInitialCapacity 11, load factor 0.75

        ht.put("One", 1);
        ht.put("Two", 2);
        ht.put("Three", 3);
        ht.put("Four", 4);

        System.out.println(ht);
    }
}
