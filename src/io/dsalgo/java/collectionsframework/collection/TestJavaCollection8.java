package io.dsalgo.java.collectionsframework.collection;

import java.util.*;

public class TestJavaCollection8 {
    public static void main(String args[]) {
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}  