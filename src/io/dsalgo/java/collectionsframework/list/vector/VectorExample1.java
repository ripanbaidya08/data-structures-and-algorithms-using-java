package io.dsalgo.java.collectionsframework.list.vector;

import java.util.*;

public class VectorExample1 {
    public static void main(String args[]) {
        //Create an empty vector with initial capacity 4
        Vector<String> vec = new Vector<String>(4);

        //Adding elements to a vector
        vec.add("Tiger");
        vec.add("Lion");
        vec.add("Dog");
        vec.add("Elephant");

        //Check size and capacity
        System.out.println("Size is: " + vec.size());
        System.out.println("Default capacity is: " + vec.capacity());

        //Display Vector elements
        System.out.println("Vector element is: " + vec);

        // Adding more elements to the Vector
        vec.addElement("Rat");
        vec.addElement("Cat");
        vec.addElement("Deer");

        //Again check size and capacity after insertions of new elements
        System.out.println("Size after addition: " + vec.size());
        System.out.println("Capacity after addition is: " + vec.capacity());

        //Display Vector elements again
        System.out.println("Elements are: " + vec);

        //Checking if Tiger is present or not in this vector
        if (vec.contains("Tiger")) {
            System.out.println("Tiger is present and its index is" + vec.indexOf("Tiger"));
        } else {
            System.out.println("Tiger is not present in the Vector.");
        }

        // Get the element at specific index
        System.out.println("Element at Index 2: "+vec.elementAt(2));
        // Get the first element
        System.out.println("The first animal of the vector is = " + vec.firstElement());
        // Get the last element
        System.out.println("The last animal of the vector is = " + vec.lastElement());

        Enumeration<String> elements = vec.elements(); // It returns an enumeration of the components of a vector.

        System.out.println("Current Capacity of Vector: "+vec.capacity());
        /**
         * ensureCapacity():
         * It is used to increase the capacity of the vector which is in use, if necessary.
         * It ensures that the vector can hold at least the number of components specified by the minimum capacity argument.
         *
         * Here, our Vector has Current Capacity 8, with total Seven elements.
         * If we ensure the capacity > current capacity then that capacity will be Accepted by Vector but vice versa will not happen.
         */
        vec.ensureCapacity(5); // ensureCapacity(8) < curCapacity(8) . Not Considered
        vec.ensureCapacity(15); // ensureCapacity(15) > curCapacity(8) . Accepted
        System.out.println("After ensureCapacity(): "+vec.capacity());
        System.out.println(vec);
    }
}  