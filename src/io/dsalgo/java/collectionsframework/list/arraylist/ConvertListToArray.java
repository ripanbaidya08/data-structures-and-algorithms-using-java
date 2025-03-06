package io.dsalgo.java.collectionsframework.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ConvertListToArray {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        // Convert List to int array
        Integer[] arr = li.toArray(new Integer[li.size()]);

        System.out.println(arr);
    }
}
