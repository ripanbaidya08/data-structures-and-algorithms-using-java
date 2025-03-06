package io.dsalgo.java.collectionsframework.list.arraylist;

import java.util.*;

public class SizeCapacity {
    public static void main(String[] args) throws Exception {
        // Create an ArrayList of Integer type  
        ArrayList<Integer> li = new ArrayList<Integer>();
        // Print the size of the ArrayList using the size() method  
        System.out.println("The size of the array is: " + li.size()); // 0

        // Default Initial Capacity is 10
        ArrayList<Integer> li2 = new ArrayList<Integer>(5); // Here, We have given an Initial Capacity to the ArrayList
        System.out.println("The size of the array is: " + li.size()); // 0 because no elements were added
    }
}  