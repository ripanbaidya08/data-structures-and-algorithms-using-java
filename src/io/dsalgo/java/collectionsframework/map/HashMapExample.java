package io.dsalgo.java.collectionsframework.map;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> mp = new HashMap<>();

        mp.put("John", 2);
        mp.put("Michel", 9);
        mp.put("Ryan", 8);
        mp.putIfAbsent("Bob", 10);

        System.out.println("Contains key: "+mp.containsKey("John"));

        System.out.println("Contains value: "+mp.containsValue(3));

        Integer removed = mp.remove("John");

        boolean removed1 = mp.remove("Bob", 10); // key & value must be match if we want to delete that item. return type is boolean
        System.out.println("removed = " + removed);

        Set<Map.Entry<String, Integer>> entries = mp.entrySet();
        Set<String> strings = mp.keySet();
        Collection<Integer> values = mp.values();


    }
}
