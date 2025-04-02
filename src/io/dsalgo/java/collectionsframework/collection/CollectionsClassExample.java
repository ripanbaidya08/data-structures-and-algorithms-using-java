package io.dsalgo.java.collectionsframework.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsClassExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10); list.add(34);
        list.add(94); list.add(3);
        list.add(5); list.add(94);

        System.out.println("Using binarySearch() :"+ Collections.binarySearch(list, 19));

        List<String> srclst = new ArrayList<String>(3);
        List<String> destlst = new ArrayList<String>(3);

        // Adding element to srclst
        srclst.add("Ram");srclst.add("Gopal");srclst.add("Verma");

        // Adding element to destlst
        destlst.add("1"); destlst.add("2"); destlst.add("3");

        /**
         * The destination list must have as least the number of items preset in a source list
         *  If the destination list has leaser number of elements that source list then it will throw
         * IndexOutOfBoundException.
         */
        Collections.copy(destlst, srclst);
        System.out.println(destlst);

        List<Integer> threadSafeList = Collections.synchronizedList(list);

        threadSafeList.add(100);
        threadSafeList.add(500);

        System.out.println("list = " + list);
        System.out.println("threadSafeList = " + threadSafeList); // backed by
    }
}
